package com.fsoft.mock2.service.service_impl;

import com.fsoft.mock2.dto.response.API;
import com.fsoft.mock2.entity.User;
import com.fsoft.mock2.repository.UserRepository;
import com.fsoft.mock2.service.service_interface.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final ModelMapper mapper;
    private final JavaMailSender javaMailSender;
    private final PasswordEncoder bcryptEncoder;
    private final Helper helper;

    public UserServiceImpl(UserRepository userRepository, ModelMapper mapper, JavaMailSender javaMailSender, PasswordEncoder bcryptEncoder, Helper helper) {
        this.userRepository = userRepository;
        this.mapper = mapper;
        this.javaMailSender = javaMailSender;
        this.bcryptEncoder = bcryptEncoder;
        this.helper = helper;
    }

    //cau hoi ngu: getUser bang cach @Query hay get trong class Helper?
    public List<com.fsoft.mock2.dto.request.UserRequestDto> getRequestList(){
        List<User> list = this.userRepository.findAll();
        List<com.fsoft.mock2.dto.request.UserRequestDto> list2 = new ArrayList<>();
        for (User u : list){
            list2.add(mapper.map(u, com.fsoft.mock2.dto.request.UserRequestDto.class));
        }
        return list2;
    }

    public void sendMail(String to, String otp){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject("FPT Software Quizzes activation");
        message.setText("This is your OTP: " + otp);
        javaMailSender.send(message);
    }

    public API reSendOTP(String email){
        com.fsoft.mock2.dto.request.UserRequestDto userRequestDTO = helper.getUser(email, getRequestList());
        if(userRequestDTO == null){
            return new API(false, "this email not exists");
        }else{
            String new_otp = helper.generateOTP();
            userRequestDTO.setOtp(new_otp);
            User user1 = mapper.map(userRequestDTO, User.class);
            this.userRepository.save(user1);
            sendMail(email, new_otp);
            return new API(true, "Re-send OTP successfully");
        }
    }

    public API register(com.fsoft.mock2.dto.request.UserRequestDto user){
        com.fsoft.mock2.dto.request.UserRequestDto userRequestDTO = helper.getUser(user.getEmail(), getRequestList());
        if(userRequestDTO != null){
            return new API(false, "this email exists");
        }else{
            String otp = helper.generateOTP();
            user.setOtp(otp);
            user.setEnable(false);
            user.setPassword(bcryptEncoder.encode(user.getPassword()));
            User user1 = mapper.map(user, User.class);
            this.userRepository.save(user1);
            sendMail(user.getEmail(), user.getOtp());
            return new API(true, "Register successfully. Go to your mail and active account");
        }
    }

    public API active(String email, String otp){
        try {
            User user = this.userRepository.findByEmail(email);
            com.fsoft.mock2.dto.request.UserRequestDto userRequestDTO = mapper.map(user, com.fsoft.mock2.dto.request.UserRequestDto.class);
                if(otp.equals(userRequestDTO.getOtp())){
                    userRequestDTO.setEnable(true);
                    User user1 = mapper.map(userRequestDTO, User.class);
                    this.userRepository.save(user1);
                    return new API(true,"Active account successfully");
                }else{
                    return new API(false,"Wrong OTP, please check your email");
                }
        }catch (Exception e){
            return new API(false,"User not exist!");
        }
    }
}

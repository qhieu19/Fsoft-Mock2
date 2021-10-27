package com.fsoft.mock2.service.service_impl;

import com.fsoft.mock2.DTO.Request.UserRequestDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class Helper {
    public UserRequestDTO getUser(String email, List<UserRequestDTO> list){
        return list.stream().filter(user -> user.getEmail().equals(email)).findAny().orElse(null);
    }

    public String generateOTP(){
        Random random = new Random();
        String otp =String.valueOf(100000 + random.nextInt(900000));
        return otp;
    }
}

package com.fsoft.mock2.service.service_impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class Helper {
    public com.fsoft.mock2.dto.request.UserRequestDto getUser(String email, List<com.fsoft.mock2.dto.request.UserRequestDto> list){
        return list.stream().filter(user -> user.getEmail().equals(email)).findAny().orElse(null);
    }

    public String generateOTP(){
        Random random = new Random();
        String otp =String.valueOf(100000 + random.nextInt(900000));
        return otp;
    }
}

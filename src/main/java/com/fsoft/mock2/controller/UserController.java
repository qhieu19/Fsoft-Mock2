package com.fsoft.mock2.controller;

import com.fsoft.mock2.dto.request.UserRequestDto;
import com.fsoft.mock2.dto.response.API;
import com.fsoft.mock2.service.service_interface.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public API register(@RequestBody UserRequestDto user){
        return userService.register(user);
    }

    @PostMapping("/active/{mail}/{otp}")
    public API active(@PathVariable String mail, @PathVariable String otp){
        return userService.active(mail, otp);
    }

    @PostMapping("/re-send/{mail}")
    public API reSend(@PathVariable String mail){
        return userService.reSendOTP(mail);
    }
}

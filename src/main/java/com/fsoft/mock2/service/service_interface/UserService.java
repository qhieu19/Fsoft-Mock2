package com.fsoft.mock2.service.service_interface;

import com.fsoft.mock2.dto.response.API;

public interface UserService {
    API register(com.fsoft.mock2.dto.request.UserRequestDto userRequestDTO);
    API reSendOTP(String mail);
    API active(String mail, String otp);
}

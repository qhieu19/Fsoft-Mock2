package com.fsoft.mock2.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserRequestDTO {
    private int id;
    private String full_name;
    private String email;
    private String password;
    private boolean enable;
    private String otp;
}

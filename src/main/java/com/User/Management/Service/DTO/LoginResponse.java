package com.User.Management.Service.DTO;

import lombok.Data;

@Data
public class LoginResponse {
    private String token;
    private String responseToken;
}

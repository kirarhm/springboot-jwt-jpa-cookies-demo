package com.jwt.with.jpa.example.request;

import lombok.Data;

@Data
public class LoginRequest {

    private String username, password;
}

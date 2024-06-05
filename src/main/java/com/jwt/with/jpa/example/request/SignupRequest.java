package com.jwt.with.jpa.example.request;


import lombok.Data;

import java.util.Set;

@Data
public class SignupRequest {
    private String username, email, password;
    private Set<String> role;
}

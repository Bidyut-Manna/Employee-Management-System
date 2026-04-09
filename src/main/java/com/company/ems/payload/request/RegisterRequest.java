package com.company.ems.payload.request;

import com.company.ems.entity.Users;
import lombok.Data;

@Data
public class RegisterRequest {
    private String username;
    private String password;
    private String role;
}

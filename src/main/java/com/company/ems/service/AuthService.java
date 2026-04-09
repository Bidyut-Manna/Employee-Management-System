package com.company.ems.service;


import com.company.ems.payload.request.LoginRequest;
import com.company.ems.payload.response.LoginResponse;

public interface AuthService {
    LoginResponse login(LoginRequest request);
}

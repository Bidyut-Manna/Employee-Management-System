package com.company.ems.service;

import com.company.ems.entity.Users;
import com.company.ems.payload.request.RegisterRequest;
import com.company.ems.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class RegisterService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public void register(RegisterRequest registerRequest) {
        Users user = new Users();
        user.setUsername(registerRequest.getUsername());
        user.setPassword(passwordEncoder.encode(registerRequest.getPassword()));
        user.setRole(Users.Role.valueOf(registerRequest.getRole()));
        user.setCreatedAt(LocalDateTime.now());
        userRepository.save(user);
    }

}

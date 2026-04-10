package com.company.ems.service;

import com.company.ems.entity.Users;
import com.company.ems.payload.request.UserRegisterRequest;
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

    public void register(UserRegisterRequest userRegisterRequest) {
        Users user = new Users();
        user.setUsername(userRegisterRequest.getUsername());
        user.setPassword(passwordEncoder.encode(userRegisterRequest.getPassword()));
        user.setRole(Users.Role.valueOf(userRegisterRequest.getRole()));
        user.setCreatedAt(LocalDateTime.now());
        userRepository.save(user);
    }

}

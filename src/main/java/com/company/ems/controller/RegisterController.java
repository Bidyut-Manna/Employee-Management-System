package com.company.ems.controller;

import com.company.ems.payload.request.CreateEmployeeRequest;
import com.company.ems.payload.request.RegisterRequest;
import com.company.ems.payload.response.CreateEmployeeResponse;
import com.company.ems.service.AuthService;
import com.company.ems.service.EmployeeService;
import com.company.ems.service.RegisterService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
@RequiredArgsConstructor

public class RegisterController {

    private final RegisterService registerService;
    @PostMapping("/user")
    public ResponseEntity<String> register(@RequestBody RegisterRequest request){
        registerService.register(request);
        return ResponseEntity.ok("User registered successfully");
    }

    @PostMapping("/users")
    public String test() {
        return "WORKING";
    }
}



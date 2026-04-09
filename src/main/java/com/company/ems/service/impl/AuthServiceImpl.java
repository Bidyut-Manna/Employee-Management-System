package com.company.ems.service.impl;


import com.company.ems.entity.Employees;
import com.company.ems.entity.Users;
import com.company.ems.payload.request.LoginRequest;
import com.company.ems.payload.response.LoginResponse;
import com.company.ems.repository.EmployeeRepository;
import com.company.ems.repository.UserRepository;
import com.company.ems.security.JwtUtil;
import com.company.ems.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;
    private final EmployeeRepository employeeRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;

    @Override
    public LoginResponse login(LoginRequest request) {

        // 1. Find user
        Users user = userRepository.findByUsername(request.getUsername())
                .orElseThrow(() -> new RuntimeException("User not found"));

        // 2. Validate password
        if (!passwordEncoder.matches(request.getPassword(), user.getPassword())) {
            throw new ResponseStatusException(
                    HttpStatus.UNAUTHORIZED, "Invalid username or password");
        }

        // 3. Generate token
        String token = jwtUtil.generateToken(user.getUsername());

        // 4. Get employeeId
        Employees emp = employeeRepository.findByUser(user)
                .orElseThrow(() -> new RuntimeException("Employee not found"));

        // 5. Build response
        return LoginResponse.builder()
                .accessToken(token)
//                .role(user.getRole())
                .role(user.getRole().name()) // IMPORTANT
                .employeeId(emp.getId())
                .build();
    }
}
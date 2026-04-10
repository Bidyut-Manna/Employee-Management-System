package com.company.ems.controller;

import com.company.ems.payload.request.PayrollRequest;
import com.company.ems.payload.response.PayrollResponse;
import com.company.ems.service.PayrollService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payroll")
@RequiredArgsConstructor
public class PayrollController {

    private final PayrollService payrollService;

    @PostMapping
    public ResponseEntity<PayrollResponse> calculateSalary(
            @RequestBody PayrollRequest request) {

        return ResponseEntity.ok(payrollService.calculateSalary(request));
    }
}
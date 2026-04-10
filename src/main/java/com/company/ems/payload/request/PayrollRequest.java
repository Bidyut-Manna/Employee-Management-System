package com.company.ems.payload.request;

import lombok.Data;

@Data
public class PayrollRequest {
    private Long employeeId;
    private String month; // format: 2026-04
}

package com.company.ems.payload.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PayrollResponse {
    private Long employeeId;
    private int presentDays;
    private int totalDays;
    private double salary;
}
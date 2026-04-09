package com.company.ems.payload.response;

import com.company.ems.entity.Users;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class CreateEmployeeResponse {

    private Long id;
    private String name;
    private String designation;
    private Long phone;
    private Double salary;
    private Long userId;
    private LocalDate joiningDate;
}
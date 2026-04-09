package com.company.ems.payload.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeData {

    private Integer id;
    private String name;
    private String department;
    private String designation;
    private Double salary;
}
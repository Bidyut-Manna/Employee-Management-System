package com.company.ems.payload.request;


import com.company.ems.entity.Users;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import lombok.Data;

import java.time.LocalDate;

@Data
public class CreateEmployeeRequest {

    @NotNull
    private String name;
    @NotNull
    @Pattern(regexp = "\\d{10}", message = "Phone must be 10 digits")
    private String phone;
    @NotNull
    private String designation;
    @NotNull
    @Positive
    private Double salary;
    @NotNull
    private Long userId;
    @NotNull
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate joiningDate;
}

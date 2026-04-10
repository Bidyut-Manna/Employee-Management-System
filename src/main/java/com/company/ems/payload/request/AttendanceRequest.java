package com.company.ems.payload.request;


import com.company.ems.entity.Attendance;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class AttendanceRequest {
    @NotNull
    private Long employeeId;
    @NotNull
    private Attendance.AttendanceStatus attendance;
    @NotNull
    @JsonFormat(pattern = "yyyy-MM-dd")
    private String date;
}
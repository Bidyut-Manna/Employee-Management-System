package com.company.ems.payload.response;

import com.company.ems.entity.Attendance;
import lombok.*;

@Data
@AllArgsConstructor
@Builder
public class AttendanceResponse {
    private Long employeeId;
    private Attendance.AttendanceStatus attendance;
    private String date;
}
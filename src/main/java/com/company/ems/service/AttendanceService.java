package com.company.ems.service;

import com.company.ems.entity.Attendance;
import com.company.ems.payload.request.AttendanceRequest;
import com.company.ems.payload.response.AttendanceResponse;
import com.company.ems.repository.AttendanceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class AttendanceService {

    private final AttendanceRepository attendanceRepository;

    public AttendanceResponse markAttendance(AttendanceRequest request) {

        Attendance attendance = Attendance.builder()
                .employeeId(request.getEmployeeId())
                .attendance(request.getAttendance())
                .date(LocalDate.parse(request.getDate()))
                .build();

        attendanceRepository.save(attendance);

        return AttendanceResponse.builder()
                .employeeId(request.getEmployeeId())
                .attendance(request.getAttendance())
                .date(request.getDate())
                .build();
    }
}

package com.company.ems.controller;

import com.company.ems.payload.request.AttendanceRequest;
import com.company.ems.payload.response.AttendanceResponse;
import com.company.ems.service.AttendanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/attendance")
@RequiredArgsConstructor
public class AttendanceController {

    private final AttendanceService attendanceService;

    @PostMapping
    public ResponseEntity<AttendanceResponse> markAttendance(
            @RequestBody AttendanceRequest request) {

        return ResponseEntity.ok(attendanceService.markAttendance(request));
    }
}
package com.company.ems.repository;

import com.company.ems.entity.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface AttendanceRepository extends JpaRepository<Attendance, Long> {

    int countByEmployeeIdAndAttendanceAndDateBetween(
            Long employeeId,
            Attendance.AttendanceStatus attendance,
            LocalDate startDate,
            LocalDate endDate
    );
}


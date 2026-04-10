package com.company.ems.service;

import com.company.ems.entity.Attendance;
import com.company.ems.entity.Employees;
import com.company.ems.payload.request.PayrollRequest;
import com.company.ems.payload.response.PayrollResponse;
import com.company.ems.repository.AttendanceRepository;
import com.company.ems.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.YearMonth;

@Service
@RequiredArgsConstructor
public class PayrollService {

    private final AttendanceRepository attendanceRepository;
    private final EmployeeRepository employeeRepository;

    public PayrollResponse calculateSalary(PayrollRequest request) {

        // 1. Parse month
        YearMonth yearMonth = YearMonth.parse(request.getMonth());

        LocalDate startDate = yearMonth.atDay(1);
        LocalDate endDate = yearMonth.atEndOfMonth();

        // 2. Count present days
        int presentDays = attendanceRepository
                .countByEmployeeIdAndAttendanceAndDateBetween(
                        request.getEmployeeId(),
                        Attendance.AttendanceStatus.PRESENT,
                        startDate,
                        endDate
                );

        // 3. Total days in month
        int totalDays = yearMonth.lengthOfMonth();


        Employees emp = employeeRepository.findById(request.getEmployeeId())
                .orElseThrow(() -> new RuntimeException("Employee not found"));

        // 4. Salary calculation
        double monthlySalary = emp.getSalary();

        double salary = (presentDays * monthlySalary) / totalDays;

        // 5. Return response
        return PayrollResponse.builder()
                .employeeId(request.getEmployeeId())
                .presentDays(presentDays)
                .totalDays(totalDays)
                .salary(salary)
                .build();
    }
}

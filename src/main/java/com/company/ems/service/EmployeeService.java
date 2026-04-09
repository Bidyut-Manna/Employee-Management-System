package com.company.ems.service;

import com.company.ems.entity.Employees;
import com.company.ems.entity.Users;
import com.company.ems.payload.request.CreateEmployeeRequest;
import com.company.ems.payload.response.CreateEmployeeResponse;
import com.company.ems.repository.EmployeeRepository;
import com.company.ems.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private UserRepository userRepository;

    public CreateEmployeeResponse createEmployee(CreateEmployeeRequest request){

        Users user = userRepository.findById(request.getUserId())
                .orElseThrow(() -> new RuntimeException("User not found"));

        Employees emp = new Employees();
        emp.setName(request.getName());
        emp.setDesignation(request.getDesignation());
        emp.setSalary(request.getSalary());
        emp.setUser(user);
        emp.setPhone(Long.valueOf(request.getPhone()));
        emp.setJoiningDate(request.getJoiningDate());

        employeeRepository.save(emp);

        // Return response
        return CreateEmployeeResponse.builder()
                .id(emp.getId())
                .name(emp.getName())
                .phone(emp.getPhone())
                .designation(emp.getDesignation())
                .salary(emp.getSalary())
                .joiningDate(emp.getJoiningDate())
                .userId(emp.getUser().getId())
                .build();
    }
}

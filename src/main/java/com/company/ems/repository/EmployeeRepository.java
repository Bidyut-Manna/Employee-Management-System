package com.company.ems.repository;

import com.company.ems.entity.Employees;
import com.company.ems.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employees, Long> {

    Optional<Employees> findByUser(Users user);
}
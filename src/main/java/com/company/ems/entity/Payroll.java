package com.company.ems.entity;

//import jakarta.persistence.*;
//import lombok.*;
//
//import java.time.LocalDateTime;
//
//@Entity
//@Table(
//        name = "payroll",
//        uniqueConstraints = {
//                @UniqueConstraint(columnNames = {"employee_id", "month", "year"})   //These fields should be unique together in DB
//        }
//)
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
//public class Payroll {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    //Many payroll records belong to one employee
//    @ManyToOne
//    @JoinColumn(name = "employee_id", nullable = false)
//    private Employees employee;
//
//    @Column(nullable = false)
//    private Integer month; // 1–12
//
//    @Column(nullable = false)
//    private Integer year;
//
//    @Column(name = "basic_salary", nullable = false)
//    private Double basicSalary;
//
//    @Column(nullable = false)
//    private Double deductions;
//
//    @Column(nullable = false)
//    private Double bonus;
//
//    @Column(name = "net_salary", nullable = false)
//    private Double netSalary;
//
//    @Column(name = "generated_at", nullable = false, updatable = false)
//    private LocalDateTime generatedAt;
//
//    @PrePersist
//    public void prePersist() {
//        this.generatedAt = LocalDateTime.now();
//    }
//}

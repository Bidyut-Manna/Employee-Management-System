//package com.company.ems.entity;
//
//import jakarta.persistence.*;
//import lombok.*;
//
//import java.time.LocalDate;
//
//@Entity
//@Table(
//        name = "leaves",
//        uniqueConstraints = {
//                @UniqueConstraint(columnNames = {"employee_id", "date"})  //These fields should be unique together in DB
//        }
//)
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
//public class Leaves {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    // Many leave records belong to one employee
//    @ManyToOne
//    @JoinColumn(name = "employee_id", nullable = false)
//    private Employees employee;
//
//    @Column(nullable = false)
//    private LocalDate date;
//
//    @Column(nullable = false)
//    private Type type; // e.g., SICK, CASUAL, PAID
//
//    @Enumerated(EnumType.STRING)
//    @Column(nullable = false)
//    private Status status;
//
//    public enum Status {
//        PENDING,
//        APPROVED,
//        REJECTED
//    }
//
//    public enum Type {
//        SICK,
//        CASUAL,
//        PAID
//    }
//}

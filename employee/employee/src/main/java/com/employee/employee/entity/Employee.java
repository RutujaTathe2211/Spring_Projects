package com.employee.employee.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Table(name="Employee_Details")
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @Column(name="EmployeeId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name="EmployeeName")
    private String name;
    @Column(name="DepartmentName")
    private String department;
    @Column(name="TotalSalary")
    private long salary;

}

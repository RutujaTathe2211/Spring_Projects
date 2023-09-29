package com.student.student.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Entity
@Data
@Table(name="StudentDetails")
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="StudentId")
    private int id;
    @Column(name="StudentName")
    private String name;
    @Column(name="StudentMarks")
    private int marks;
    @Column(name="MobileNo")
    private long mobno;
}

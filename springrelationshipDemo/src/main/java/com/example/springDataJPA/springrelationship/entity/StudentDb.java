package com.example.springDataJPA.springrelationship.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder //used to create object
@Table(name="tb1_student",
       uniqueConstraints = @UniqueConstraint(
               name="emailid_unique",
               columnNames = "email_Address"
))
public class StudentDb {
    @Id
    @SequenceGenerator(
            name="student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
            )
    @GeneratedValue(strategy = GenerationType.SEQUENCE
    ,generator = "student_sequence")
    private long studentId;
    private String studentName;

    @Column(name="email_Address",
            nullable=false
    )
    private String studentEmail;
    @Embedded
  private Guardian guardian;

}

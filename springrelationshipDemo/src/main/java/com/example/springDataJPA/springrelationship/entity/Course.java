package com.example.springDataJPA.springrelationship.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Course {
    @Id
    @SequenceGenerator(name = "course_sequence",
    sequenceName = "course_sequence",
    allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
              generator = "course_sequence")
    private Long courseId;
    private String title;
    private Integer credit;
   // two-directional mapping//in coursematerial class one to one mapping is already define
    @OneToOne(
            mappedBy = "course"
    )
    private CourseMaterial courseMaterial;
    //many to one
    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name="teacher_id",
            referencedColumnName = "teacherID"
    )
    private Teacher teacher;

    @ManyToMany(
            cascade = CascadeType.ALL
    )
    @JoinTable(
            name = "student_course_mapping",
            joinColumns = @JoinColumn(
                    name = "course_id",
                    referencedColumnName = "courseId"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "student_id",
                    referencedColumnName = "studentId"
            )
    )
    private List<StudentDb> students;
//    public void addStudents(StudentDb student){
//        if(student==null) students=new ArrayList<>();
//        students.add(student);
//
//    }

}

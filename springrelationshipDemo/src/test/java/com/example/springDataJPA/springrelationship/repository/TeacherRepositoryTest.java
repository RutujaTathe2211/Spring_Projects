package com.example.springDataJPA.springrelationship.repository;

import com.example.springDataJPA.springrelationship.entity.Course;
import com.example.springDataJPA.springrelationship.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class TeacherRepositoryTest {
    @Autowired
private TeacherRepository teacherRepository;
    @Test
    public void saveTeacher(){
        Course courseDBA=Course.builder()
                .title("DBA").
                credit(5).build();

        Course courseJAVA=Course.builder()
                .title("JAVA").
                credit(6).build();

        Course coursePYTHON=Course.builder()
                .title("Python").
                credit(7).build();


        Teacher teacher=Teacher.builder()
                .firstName("qutub").
                lastName("khan")
                //courseList((List.of(courseDBA,courseJAVA,coursePYTHON)))
                 .build();
        teacherRepository.save(teacher);

    }
}
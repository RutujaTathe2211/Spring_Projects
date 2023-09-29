package com.example.springDataJPA.springrelationship.repository;

import com.example.springDataJPA.springrelationship.entity.Course;
import com.example.springDataJPA.springrelationship.entity.CourseMaterial;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CourseMaterialRepositoryTest {
    @Autowired
    private CourseMaterialRepository repository;


    @Test
    public void saveCourseMatrial() {
        Course course = Course.builder()
                .credit(6).title(".net").build();

        CourseMaterial courseMaterial = CourseMaterial.builder()
                .url("www.dailycodebuffer.com").
                course(course).
                build();
        repository.save(courseMaterial);
    }

        //cascading means to pass the permission/properties to child
        //want to save of coursematerial then first we need to save course
@Test
        public void printAllCourseMaterial(){
            List<CourseMaterial> courseMaterialList=
                    repository.findAll();
        }

}
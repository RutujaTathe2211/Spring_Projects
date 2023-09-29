package com.example.springDataJPA.springrelationship.repository;

import com.example.springDataJPA.springrelationship.entity.Course;
import com.example.springDataJPA.springrelationship.entity.StudentDb;
import com.example.springDataJPA.springrelationship.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.*;

import java.awt.print.Pageable;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CourseRepositoryTest {
    @Autowired
    private CourseRepository courseRepository;
    @Test
        public void printCourse (){
        List<Course> courseList=courseRepository.findAll();
        System.out.print(courseList);

    }
    @Test
    public void saveCourseWithTeacher(){
        Teacher teacher=Teacher.builder().firstName("priyanka")
                .lastName("singh")
                .build();
        Course course=Course.builder().
        title("HTML").credit(7).teacher(teacher).build();
        courseRepository.save(course);
    }
//    @Test
//    public void findAllPagination(){
//        Pageable firstPageWithThreeRecords=
//                (Pageable) PageRequest.of(0,2);
//
//           Pageable secondPageWithTwoRecords=
//                   (Pageable) PageRequest.of(1,2);
//
//        List<Course> courses;
//        courses = courseRepository.findAll((Sort) firstPageWithThreeRecords).getContent();
//        System.out.println("Courses ="+courses);
//
//    }
    @Test
    public void saveCourseWithStudentAndTeacher(){
        Teacher teacher=Teacher.builder()
                .firstName("Lizze")
                .lastName("Morgan").build();

        StudentDb studentDb=StudentDb.builder()
                .studentName("Sakshi").
                studentEmail("sakshineutrino@gmail.com")
                .build();

        Course course=Course.builder()
                .title("AI").credit(12).teacher(teacher).build();
        course.addStudents(studentDb);
        courseRepository.save(course);

    }

}
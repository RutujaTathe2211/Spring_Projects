package com.student.student.controller;

import com.student.student.entity.Student;
import com.student.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/addstudent")
    public Student postDetails(@RequestBody Student student){
        return studentService.saveDetails(student);
    }
    @GetMapping("/students")
    public ResponseEntity getAllStudents() {

        return (ResponseEntity)studentService.getAllStudent();
    }
    @GetMapping("/students/{studentId}")
    public ResponseEntity getId(@PathVariable("studentId") int studentId){
        return studentService.getStudentById(studentId);
    }
    @PutMapping("/students/{studentId}")

    public ResponseEntity updateStudentById(@RequestBody Student student, @PathVariable("studentId") int studentId) {
        try{
            ResponseEntity existStudent=getId(studentId);
            studentService.updateStudent(student);
        }catch(NoSuchElementException e){
            e.printStackTrace();
        }
        return new ResponseEntity<Student>(student, HttpStatus.OK);
    }

    @DeleteMapping("/students/{studentId}")
    public void deleteStudent(@PathVariable int studentId){
        studentService.getStudentById(studentId);
    }



}

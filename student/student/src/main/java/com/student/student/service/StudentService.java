package com.student.student.service;

import com.student.student.entity.Student;
import com.student.student.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    public Student saveDetails(Student student) {
        return studentRepo.save(student);
    }

    public ResponseEntity getAllStudent() {
        return ResponseEntity.ok(studentRepo.findAll());

    }
    public ResponseEntity getStudentById(int studentId){
        return ResponseEntity.ok(studentRepo.findById(studentId));
    }
    public void updateStudent(Student s){
        s.getId();
        studentRepo.save(s);
    }
    public void  deleteStudent(int id){
        studentRepo.deleteById(id);
    }
}

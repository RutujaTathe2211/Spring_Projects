package com.example.springDataJPA.springrelationship.repository;

import com.example.springDataJPA.springrelationship.entity.Guardian;
import com.example.springDataJPA.springrelationship.entity.StudentDb;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class studentRepositoryTest {
    @Autowired
    private studentRepository studentRepository;
    //@Test
//    public void saveStudent(){
//        StudentDb student= StudentDb.builder()
//                .studentName("Rutuja").studentId(111)
//                .studentEmail("rutujattahe@gmail.com")
//              //  guardianName("Kailas")
//                //.guardianMobile("9822357464")
//                 .build();
//        studentRepository.save(student);
//    }
    @Test
    public void printAllStudent(){
        List<StudentDb> studentlist=studentRepository.findAll();
        System.out.println("StudentList"+studentlist);
    }
    @Test
    public void saveStudentWithGuardian(){
        StudentDb student= StudentDb.builder()
                .studentName("Ankita").
                studentEmail("ankitatathe@gmail.com").
                studentId(125).build();

        Guardian guardian=Guardian.builder().
                guardianName("kailas").
                guardianMobile("98706858484").build();
        studentRepository.save(student);

    }
    @Test
    public void printStudentBystudentName(){
          List<StudentDb> students=studentRepository.findBystudentName("Rutuja");
        System.out.println(students);

    }
    @Test
    public void printStudentBystudentNameContaining(){
        List<StudentDb> students=studentRepository.findByStudentNameContaining("Ni");
        System.out.println(students);

    }
    @Test
//    public void printstudentBystudentEmail(){
//        List<StudentDb> student=studentRepository.findBystudentEmail("sakshiShaha@gmail.com");
//        System.out.println(student);
//    }
    public void printstudentBystudentEmail(){
        StudentDb studentdb= studentRepository.findBystudentEmail("sakshiShaha@gmail.com");
        System.out.println(studentdb);
    }
    @Test
    public void updateStudentNameByEmailIDTest(){
        studentRepository.updatestudentNameByEmail(
                "Shraddha",
                "rutujattahe@gmail.com"

        );
    }


}
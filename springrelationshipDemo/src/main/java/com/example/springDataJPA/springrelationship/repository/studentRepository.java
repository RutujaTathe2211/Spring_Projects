package com.example.springDataJPA.springrelationship.repository;

import com.example.springDataJPA.springrelationship.entity.StudentDb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface studentRepository extends JpaRepository<StudentDb,Long> {
    public List<StudentDb> findBystudentName(String studentName);
    public List<StudentDb> findByStudentNameContaining(String studentName);
    //jpql query---based on class not based on table
    @Query(value = "select s from StudentDb s where s.studentEmail=?1"
    )
    //@Param("studentEmail")
    public StudentDb findBystudentEmail( String studentEmail);

    //to upadte the data
    @Modifying
    @Transactional
    @Query(
            value="update tb1_student set student_name=?1 where email_address=?2"
                    ,nativeQuery = true
    )
    int updatestudentNameByEmail(String studentName,String studentEmail);

}

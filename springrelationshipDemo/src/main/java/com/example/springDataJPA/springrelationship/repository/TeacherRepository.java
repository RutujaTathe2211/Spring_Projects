package com.example.springDataJPA.springrelationship.repository;

import com.example.springDataJPA.springrelationship.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Long> {


}

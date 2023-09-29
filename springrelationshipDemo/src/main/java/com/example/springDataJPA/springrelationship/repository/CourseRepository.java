package com.example.springDataJPA.springrelationship.repository;

import com.example.springDataJPA.springrelationship.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CourseRepository extends JpaRepository<Course,Long> {
}

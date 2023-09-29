package com.springrest.springrest.service;

import com.springrest.springrest.entity.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getCourses();
    public Course getCourse(int courseId);

    public Course addCourse(Course course);

    public void updateCourse(Course cs, int courseId);
    public void deleteCourse(int courseId);
}

package com.springrest.springrest.controller;
import com.springrest.springrest.entity.Course;
import com.springrest.springrest.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class myController {
    @Autowired  //create object of implement class and load inject into courseservice for loose coupling
    private CourseService courseService;
    @GetMapping("/home")
    public String home(){
       return "Welcome to course application. ";
    }
    //get all courses
    @GetMapping("/courses")
        public List<Course> getCourses(){
        return this.courseService.getCourses();
    }
    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable int courseId){
        return this.courseService.getCourse(courseId);
    }
    @PostMapping(path="/courses",consumes="application/json")
    public Course addCourse(@RequestBody Course course){
        return this.courseService.addCourse(course);

    }
    @PutMapping("/courses/{courseId}")
    public Course updateCourse(@RequestBody Course course,@PathVariable("courseId") int courseId){
        this.courseService.updateCourse(course,courseId);
        return course;
    }
    @DeleteMapping("/courses/{courseId}")
    public void deleteCourse(@PathVariable("courseId")int courseId){
        this.courseService.deleteCourse(courseId);

    }

}

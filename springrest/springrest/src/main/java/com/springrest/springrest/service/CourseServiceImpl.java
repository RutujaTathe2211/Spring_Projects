package com.springrest.springrest.service;

import com.springrest.springrest.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService {
    List<Course> list;
    public CourseServiceImpl(){
        list=new ArrayList<>();
        list.add(new Course(145,"Java Core course","This course contain java basic."));
        list.add(new Course(146,"Python course","This course contain Python basic."));
        list.add(new Course(147,"DBMS course","This course contain DBMS ."));

    }
    public List<Course> getCourses(){
        return list;
    }

@Override
    public Course getCourse(int courseId) {
        Course c=null;
        for(Course course:list){
            if(course.getId()==courseId){
                c=course;
                break;
            }
        }
        return c;
    }

    @Override
    public Course addCourse(Course course) {
        list.add(course);
        return course;
    }
    public void updateCourse(Course cs,int courseId) {

    list.stream().map(b->{
        if(b.getId()==courseId){
            b.getId();
            b.setCourseName(cs.getCourseName());
            b.setDescription(cs.getDescription());
        }

        return b;
        }).collect(Collectors.toList());

    }
    public void deleteCourse(int courseId){
        list=list.stream().filter(course->course.getId()!=courseId).collect(Collectors.toList());
    }


}

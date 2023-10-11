package com.monisha.springboot.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Courses> reterieveAllCourses(){
        return Arrays.asList(
                new Courses(1,"Learn springboot","monisha"),
                new Courses(2,"Learn microservices","monisha"),
                new Courses(3,"Learn reactjs","monisha")
            );

    }
}

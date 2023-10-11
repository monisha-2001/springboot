package com.luv2code.demo.rest;

import com.luv2code.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;

    //
    @PostConstruct
    public void loadData(){
        theStudents=new ArrayList<>();

        theStudents.add(new Student("Monisha","Basavaraju"));
        theStudents.add(new Student("Manoj","Gowda"));
        theStudents.add(new Student("Gautham","Gowda"));
    }

    //define a endpts for "/students" -> return a list of students
    @GetMapping("/students")
    public List<Student> getStudents(){

        return theStudents;

    }

    @GetMapping("/students/{studentId}")
    public Student getStudents(@PathVariable int studentId){


        return theStudents.get(studentId);

    }
}

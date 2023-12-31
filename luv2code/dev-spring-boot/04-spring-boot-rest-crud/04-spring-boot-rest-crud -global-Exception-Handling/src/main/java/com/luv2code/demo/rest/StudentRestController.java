package com.luv2code.demo.rest;

import com.luv2code.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

        if((studentId >= theStudents.size()) || (studentId < 0)){
            throw new StudentNotFoundException("Student id not found- "+studentId);
        }

        return theStudents.get(studentId);
    }

    //add exception handler using @ExceptionHandler



}

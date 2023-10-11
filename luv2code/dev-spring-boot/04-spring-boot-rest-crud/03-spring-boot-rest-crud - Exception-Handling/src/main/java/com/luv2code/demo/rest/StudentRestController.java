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
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exce){

        //create a StudentErrorResponse
        StudentErrorResponse error=new StudentErrorResponse();

        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(exce.getMessage());
        error.setTimeStamp(System.currentTimeMillis());

        //return responseEntity

        return new ResponseEntity<>(error,HttpStatus.NOT_FOUND) ;  //also see with BADREQUEST
    }

    //handle exception for generic exception
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(Exception exce){

        //create a StudentErrorResponse
        StudentErrorResponse error=new StudentErrorResponse();

        error.setStatus(HttpStatus.BAD_REQUEST.value());
        error.setMessage(exce.getMessage());
        error.setTimeStamp(System.currentTimeMillis());

        //return responseEntity
        return new ResponseEntity<>(error,HttpStatus.NOT_FOUND) ;    }


}

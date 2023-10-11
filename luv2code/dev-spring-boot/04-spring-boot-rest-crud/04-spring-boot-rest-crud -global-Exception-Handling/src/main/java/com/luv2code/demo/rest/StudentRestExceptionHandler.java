package com.luv2code.demo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentRestExceptionHandler {

    //add exception handling code here for numbers
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exce){

        //create a StudentErrorResponse
        StudentErrorResponse error=new StudentErrorResponse();

        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(exce.getMessage());
        error.setTimeStamp(System.currentTimeMillis());

        //return responseEntity

        return new ResponseEntity<>(error,HttpStatus.NOT_FOUND) ;
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
        return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST) ;    }
}

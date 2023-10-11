package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @GetMapping("/employees")
    public List<Employee> reteriveEmployee(){
        return Arrays.asList(
                new Employee(1,"ram","ISE"),
                new Employee(2,"seetha","CSE"),
                new Employee(3,"lakshman","ECE")
        );
    }
    @PostMapping
    public String addEmployee(@RequestBody Employee employee){
        return "created";
    }

    @PutMapping
    public String updateEmployee(@RequestBody Employee employee){
        return "updated";
    }


}

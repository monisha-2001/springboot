package com.example.restdemo.controller;


import com.example.restdemo.model.Project;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloud")
public class CloudVendorAPIService {

    Project myProject;
    @GetMapping("{projectId}")
    public Project getProject(String projectId){
        return  myProject;
//                new Project(1,"ims","manjuPrasad");

    }

    @PostMapping
    public String createProject(@RequestBody Project theProject){
        this.myProject=theProject;
        return "Project is created";
    }

    @PutMapping
    public String updateProject(@RequestBody Project theProject){
        this.myProject=theProject;
        return "Project updated successfully";
    }

    @DeleteMapping("{projectId}")
    public String deleteProject(Project theProject){
        this.myProject=theProject;
        return "Project deleted successfully";
    }
}

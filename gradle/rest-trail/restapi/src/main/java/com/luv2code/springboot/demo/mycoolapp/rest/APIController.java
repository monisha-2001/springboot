package com.luv2code.springboot.demo.mycoolapp.rest;

import com.luv2code.springboot.demo.mycoolapp.college.Project;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class APIController {

    Project myProject;
    @GetMapping("{projectId}")
    public Project getProject(int projectId){
        return new Project(1,"ims","manjuPrasad");
//                myProject;
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

    @DeleteMapping("/project/{projectId}")
    public String deleteProject(Project theProject){
        this.myProject=theProject;
        return "Project deleted successfully";
    }


}

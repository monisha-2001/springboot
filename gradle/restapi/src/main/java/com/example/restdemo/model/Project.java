package com.example.restdemo.model;

public class Project {

    private int projectId;
    private String projectName;
    private String GuideName;


    public Project() {

    }

    public Project(int projectId, String projectName, String guideName) {
        this.projectId = projectId;
        this.projectName = projectName;
        GuideName = guideName;
    }

    public int getId() {
        return projectId;
    }

    public void setId(int id) {
        this.projectId = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getGuideName() {
        return GuideName;
    }

    public void setGuideName(String guideName) {
        GuideName = guideName;
    }
}


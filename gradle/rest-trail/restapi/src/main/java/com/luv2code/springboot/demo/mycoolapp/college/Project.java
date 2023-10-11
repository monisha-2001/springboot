package com.luv2code.springboot.demo.mycoolapp.college;

public class Project {

    private int id;
    private String projectName;
    private String GuideName;


    public Project() {

    }

    public Project(int id, String projectName, String guideName) {
        this.id = id;
        this.projectName = projectName;
        GuideName = guideName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

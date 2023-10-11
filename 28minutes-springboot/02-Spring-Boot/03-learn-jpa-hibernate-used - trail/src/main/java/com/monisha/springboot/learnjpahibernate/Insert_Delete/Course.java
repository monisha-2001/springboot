package com.monisha.springboot.learnjpahibernate.Insert_Delete;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
    @Id
    private long id;
    private String name;
    private String author;

    public Course(){

    }

    public Course(long id,String name,String author){
        this.id=id;
        this.name=name;
        this.author=author;
    }

    //for select query we write these all
    public long getId(){
        return id;
    }

    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }

    public void setId(long id){
        this.id=id;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setAuthor(String author){
        this.author=author;
    }

    @Override
    public String toString(){
        return "Courses[id " +id+ " name " +name+ " author " +author+ "]";
    }




}

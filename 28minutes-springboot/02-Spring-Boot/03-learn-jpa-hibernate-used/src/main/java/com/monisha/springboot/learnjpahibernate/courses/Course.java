package com.monisha.springboot.learnjpahibernate.courses;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {

    @Id
    private long id;

//    @Column(name = "name")
    private String name;

//    @Column(name = "author")
    private String author;

   // no argument constructor
    public Course(){

    }

    //Constructor
    public Course(long id,String name,String author){
        super();
        this.id=id;
        this.name=name;
        this.author=author;
    }

    //getter
    public long getId(){
        return id;
    }
    public String getName(){
        return name;
    }

    public String getAuthor(){
        return author;
    }

    //setters
    public void setId(long id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAuthor(String author){
        this.author=author;
    }

    //toString
    @Override
    public String toString(){
        return "Course [id=" +id+",name="+name+",author="+author+"]";
    }
}

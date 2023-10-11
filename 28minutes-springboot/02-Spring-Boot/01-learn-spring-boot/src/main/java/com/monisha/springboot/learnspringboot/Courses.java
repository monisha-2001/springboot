package com.monisha.springboot.learnspringboot;

public class Courses {
    private long id;
    private String name;
    private String author;

    //constructor
    public Courses(long id,String name,String author){
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

    //tostring
    public String toString(){
        return "Courses [id=" +id +",name="+name+",author="+author+"]";
    }

}

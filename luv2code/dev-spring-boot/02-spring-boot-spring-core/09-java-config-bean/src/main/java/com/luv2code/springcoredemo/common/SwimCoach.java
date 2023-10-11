package com.luv2code.springcoredemo.common;

public class SwimCoach implements Coach{

    //create constructor :to see the instance class has been created
    public SwimCoach(){
        System.out.println("In constructor: "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up :-)";
    }
}

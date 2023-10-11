package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach{

    //constructor
    public BaseBallCoach(){
        System.out.println("In Constructor "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes in batting process";
    }
}

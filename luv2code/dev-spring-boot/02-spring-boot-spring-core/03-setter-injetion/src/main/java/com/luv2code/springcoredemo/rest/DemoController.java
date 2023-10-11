package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //define a private field for dependency
    private Coach mycoach;

    //create a setter method
    @Autowired
    public void setCoach(Coach thecoach){  //thecoach= Cricketcoach
        mycoach=thecoach;
    }

    @GetMapping("/dailyworkout")
    public String DailyWorkout(){   //this name can be same as method like getDailyWorkout()

        return mycoach.getDailyWorkout();
    }
}

package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //define a private field for dependency
    private Coach mycoach;

    private Coach myanothercoach;


    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach thecoach,
                          @Qualifier("baseBallCoach") Coach theanothercoach){
        System.out.println("In Constructor "+getClass().getSimpleName());   //this creates an instance of DemoController
        mycoach=thecoach;
        myanothercoach=theanothercoach;
    }

    @GetMapping("/dailyworkout")
    public String DailyWorkout(){   //this name can be same as method like getDailyWorkout()

        return mycoach.getDailyWorkout();

    }
    @GetMapping("/workout")
    public String dailyWorkout(){   //this name can be same as method like getDailyWorkout()

        return myanothercoach.getDailyWorkout();

    }

    @GetMapping("/check")
    public String check(){
        return "comparing beans: mycoach==myanothercoach, "+(mycoach==myanothercoach);
    }
}

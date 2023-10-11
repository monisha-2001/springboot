package com.luv2code.springcoredemo.config;

import com.luv2code.springcoredemo.common.Coach;
import com.luv2code.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aqautic")
    public Coach swimCoach(){
//        Coach swimCoach = new SwimCoach();
//        return swimCoach;
        //internal working happens like this
        return new SwimCoach();
    }
}

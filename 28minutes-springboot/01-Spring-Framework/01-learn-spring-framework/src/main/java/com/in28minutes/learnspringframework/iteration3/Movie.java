package com.in28minutes.learnspringframework.iteration3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Director(String name,int age){}
@Configuration
public class Movie {

    @Bean
    public String hero(){
        return "Puneeth";
    }

    @Bean
    public String heroine(){
        return "Sai Pallavi";
    }

    @Bean
    public int age(){
        return 21;
    }

    @Bean
    public Director direct(){
        return new Director("rajmouli",50);
    }

    @Bean("shoot")
    public Director direc(String hero,int age){
        return new Director(hero,age);
    }

    @Bean("shooting")
    public Director director(){
        return new Director(heroine(),age());
    }
}

package com.in28minutes.learnspringframework.HelloWorld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name,int age,Address address) { };

record Address(String firstline,String city){ };
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Monisha B";
    }

    @Bean
    public int age(){
        return 21;
    }

    @Bean
    public Person person(){
        return new Person("manoj",20,new Address("vontikoppal","Mysuru"));
    }

    @Bean
    public Person person2MethodCall(){
        return new Person(name(),age(),address());
    }

    @Bean
    public Person person3Parameters(String name,int age,Address address2){
        return new Person(name,age,address2);
    }
    @Bean("address2")
    public Address address(){
        return new Address("RamamandiraRoad","Mysuru");
    }
}


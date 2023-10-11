package com.in28minutes.learnspringframework.example.a0;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class BusinessService{

    private Dataservice dataservice;

    //create a getter and setter method

  @Autowired
    public void setDataservice(Dataservice dataservice){
        System.out.println("setter Injection");
        this.dataservice=dataservice;
    }

    public Dataservice getDataservice(){
        return dataservice;
    }

}

@Component
class Dataservice{

}
@Configuration
@ComponentScan
public class CDIContextLauncherApplication {

    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(CDIContextLauncherApplication.class)){

           Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            System.out.println(context.getBean(BusinessService.class).getDataservice());
        }

    }

}

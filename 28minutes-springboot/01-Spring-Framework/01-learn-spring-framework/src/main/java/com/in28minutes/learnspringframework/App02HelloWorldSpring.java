package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.HelloWorld.HelloWorldConfiguration;
import com.in28minutes.learnspringframework.iteration3.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {

        //1: Launch a Spring Context
//       var context=new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);


       //2:Configure the things that we want spring to manage
        //HelloWorldConfiguration-@configuration
        //name=@Bean

        //3:Reteriving Beans managed by Spring
//        System.out.println(context.getBean("name"));
//
//        System.out.println(context.getBean("age"));
//
//        System.out.println(context.getBean("person"));
//
//        System.out.println(context.getBean("person2MethodCall"));
//
//        System.out.println(context.getBean("person3Parameters"));
//
//
//        System.out.println(context.getBean("address2")); //we can also use Address.class




        var context=new AnnotationConfigApplicationContext(Movie.class);
//        iteration 3
        System.out.println(context.getBean("hero"));

        System.out.println(context.getBean("heroine"));

        System.out.println(context.getBean("direct"));

        System.out.println(context.getBean("shoot"));

        System.out.println(context.getBean("shooting"));
    }
}

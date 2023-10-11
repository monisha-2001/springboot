package com.in28minutes.learnspringframework.examples.a1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class BusinesClass{
     Dependency01 dependency01;
     Dependency02 dependency02;


    //@Autowired
    public BusinesClass(Dependency01 dependency01,Dependency02 dependency02){
        super();
        System.out.println("Constructor Injection-Dependency1");

        this.dependency01=dependency01;
        this.dependency02=dependency02;
    }


}
@Component
class Dependency01{

}
@Component
class Dependency02{

}


@Configuration
@ComponentScan
public class ConstructorInjection {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ConstructorInjection.class);

        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);

        System.out.println(context.getBean(BusinesClass.class));

    }
}


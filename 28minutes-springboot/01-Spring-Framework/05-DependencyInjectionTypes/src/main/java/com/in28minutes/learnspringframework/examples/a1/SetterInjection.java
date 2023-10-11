package com.in28minutes.learnspringframework.examples.a1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class BusinessClass{
    Dependency1 dependency1;
    Dependency2 dependency2;


    @Autowired
    public void setDependency1(Dependency1 dependency1){
        System.out.println("Setter Injection-Dependency1");
        this.dependency1=dependency1;
    }

    @Autowired
    public void setDependency2(Dependency2 dependency2){
        System.out.println("Setter Injection-Dependency2");
        this.dependency2=dependency2;
    }

}
@Component
class Depend1{

}
@Component
class Depend2{

}

@Configuration
@ComponentScan
public class SetterInjection {
    public static void main(String[] args) {

        var context=new AnnotationConfigApplicationContext(SetterInjection.class);

        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);

        System.out.println(context.getBean(BusinessClass.class));

    }
}

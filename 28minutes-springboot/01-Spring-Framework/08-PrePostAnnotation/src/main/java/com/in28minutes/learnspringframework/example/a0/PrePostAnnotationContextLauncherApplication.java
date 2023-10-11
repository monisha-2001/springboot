package com.in28minutes.learnspringframework.example.a0;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass{
    private SomeDependency mysomeDependency;
    public SomeClass(SomeDependency thesomeDependency){
        super();
        this.mysomeDependency=thesomeDependency;
        System.out.println("Some dependency are ready");
    }
    @PostConstruct
    public void initialize(){
        mysomeDependency.getReady();
    }

    @PreDestroy
    public void cleanup(){
        System.out.println("CleanUp");
    }
}

@Component
class SomeDependency{

    public void getReady() {
        System.out.println("Some logic using Somedependency");
    }
}
@Configuration
@ComponentScan
public class PrePostAnnotationContextLauncherApplication {

    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(PrePostAnnotationContextLauncherApplication.class)){

           Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }

    }

}

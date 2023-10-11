package com.in28minutes.learnspringframework.example.a0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class ClassA{

}
@Component
class ClassB{
    private ClassA myclassA;
    public ClassB(ClassA theclassA){
        System.out.println("Some Initialization Logic");
        this.myclassA=theclassA;
    }

}

@Configuration
@ComponentScan
public class LazyInitContextLauncherApplication {

    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(LazyInitContextLauncherApplication.class)){


        }

    }

}

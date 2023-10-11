package com.monisha.springboot.learnjpahibernate;


import com.monisha.springboot.learnjpahibernate.course.jpa.CourseJpaRepository;
import com.monisha.springboot.learnjpahibernate.courses.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
//    @Autowired
//    private CourseJdbcRepository repository;

    @Autowired
    private CourseJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(2,"learn microservices","monisha"));
        repository.insert(new Course(3,"learn devops","monisha"));
        repository.insert(new Course(4,"learn cloud","monisha"));

        repository.deletebyid(2);


        System.out.println(repository.findbyid(3));

    }
}

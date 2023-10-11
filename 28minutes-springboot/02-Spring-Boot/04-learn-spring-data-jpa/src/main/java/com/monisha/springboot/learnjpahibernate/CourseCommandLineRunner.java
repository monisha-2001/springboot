package com.monisha.springboot.learnjpahibernate;


import com.monisha.springboot.learnjpahibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import com.monisha.springboot.learnjpahibernate.courses.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
//    @Autowired
//    private CourseJdbcRepository repository;

//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;
    
    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(2,"learn microservices","monisha"));
        repository.save(new Course(3,"learn devops","monisha"));
        repository.save(new Course(4,"learn cloud","monisha"));

        repository.deleteById(2l);




        System.out.println(repository.findById(3l));

        System.out.println(repository.findAll());
        System.out.println(repository.count());

        System.out.println(repository.findByAuthor("monisha"));
        System.out.println(repository.findByAuthor(""));

        System.out.println(repository.findByName("learn devops"));
    }
}

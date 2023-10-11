package com.monisha.springboot.learnjpahibernate.course1.jdbc;

import com.monisha.springboot.learnjpahibernate.course.jdbc.CourseJdbcRepository;
import com.monisha.springboot.learnjpahibernate.courses.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Course1JdbcCommandLineRunner implements CommandLineRunner {
    @Autowired
    private Course1JdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert1(new Course(2,"learn microservices","monisha"));
        repository.insert1(new Course(3,"learn devops","monisha"));
        repository.insert1(new Course(4,"learn cloud","monisha"));

        repository.deleteByid(2);


        System.out.println(repository.findByid(4));
    }
}

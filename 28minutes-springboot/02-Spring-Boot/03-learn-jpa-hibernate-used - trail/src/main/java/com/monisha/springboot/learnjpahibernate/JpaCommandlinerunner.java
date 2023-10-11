package com.monisha.springboot.learnjpahibernate;

import com.monisha.springboot.learnjpahibernate.Insert_Delete.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class JpaCommandlinerunner implements CommandLineRunner {

    @Autowired
    private coursejparepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(5,"HTML","GSSS"));
        repository.insert(new Course(6,"CSS","GSSSIETW"));
        repository.insert(new Course(7,"CSS","GSS"));


        repository.deleteById(5);

        System.out.println(repository.findbyid(7));
    }
}

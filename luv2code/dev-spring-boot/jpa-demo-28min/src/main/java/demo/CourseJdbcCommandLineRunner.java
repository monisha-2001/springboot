package demo;

import com.luv2code.jpademo.course.jdbc.CourseJdbc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbc repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert();
    }
}

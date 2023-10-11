package com.monisha.springboot.learnjpahibernate.course1.jdbc;

import com.monisha.springboot.learnjpahibernate.courses.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Course1JdbcRepository {
    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static String INSERT_QUERY=
            """
              insert into course(id,name,author)
              values(?,?,?);
            """;

    private static String DELETE_QUERY=
            """
              delete from course where id=?
            """;

    private static String SELECT_QUERY=
            """
              select * from course where id=?
            """;
    public void insert1(Course course){
        springJdbcTemplate.update
                (INSERT_QUERY,course.getId(),course.getName(),course.getAuthor());
    }
    public void deleteByid(long id){
        springJdbcTemplate.update
                (DELETE_QUERY,id);
    }

    public Course findByid(long id){
        return springJdbcTemplate.queryForObject(SELECT_QUERY,new BeanPropertyRowMapper<>(Course.class),id);
    }
}

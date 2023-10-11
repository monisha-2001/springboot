package com.monisha.springboot.learnjpahibernate.course.jpa;

import com.monisha.springboot.learnjpahibernate.courses.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public void insert(Course course){
        entityManager.merge(course);
    }
    public Course findbyid(long id){
        return entityManager.find(Course.class,id);
    }

    public void deletebyid(long id){
        Course course=entityManager.find(Course.class,id);
         entityManager.remove(course);
    }
}
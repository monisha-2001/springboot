package com.monisha.springboot.learnjpahibernate;

import com.monisha.springboot.learnjpahibernate.Insert_Delete.Course;
import com.monisha.springboot.learnjpahibernate.Select.Course1;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
//No EntityManager with actual transaction available for current thread - cannot reliably process 'merge' call
public class coursejparepository {


    @PersistenceContext
    private EntityManager entityManager;

    public void insert(Course course){
        entityManager.merge(course);
    }

    public void deleteById(long id){
        Course course=entityManager.find(Course.class,id);
        entityManager.remove(course);
    }

    public Course findbyid(long id){

        return entityManager.find(Course.class,id);
    }


}


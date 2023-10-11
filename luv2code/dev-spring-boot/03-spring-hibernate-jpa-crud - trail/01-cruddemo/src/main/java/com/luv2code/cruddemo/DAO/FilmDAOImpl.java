package com.luv2code.cruddemo.DAO;

import com.luv2code.cruddemo.DAO.FilmDAO;
import com.luv2code.cruddemo.entity.Film;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class FilmDAOImpl implements FilmDAO {

    private EntityManager entityManager;

    public FilmDAOImpl(EntityManager entityManager){
        this.entityManager=entityManager;
    }

    @Override
    public void createfilm(Film film) {

        entityManager.persist(film);
    }

    @Override
    public void createmultiple(Film film) {
        entityManager.persist(film);
    }

    @Override
    public Film findById(Integer id) {
        return entityManager.find(Film.class,id);

    }

    @Override
    public void update(Film film) {
         entityManager.merge(film);
    }

    @Override
    public void delete(Integer id) {
        Film thefilm=entityManager.find(Film.class,id);

        entityManager.remove(thefilm);
    }
}

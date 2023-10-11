package com.luv2code.cruddemo.DAO;

import com.luv2code.cruddemo.entity.Film;

public interface FilmDAO {

    void createfilm(Film film);

    void createmultiple(Film film);

    Film findById(Integer id);

    void update(Film film);

    void delete(Integer id);
}

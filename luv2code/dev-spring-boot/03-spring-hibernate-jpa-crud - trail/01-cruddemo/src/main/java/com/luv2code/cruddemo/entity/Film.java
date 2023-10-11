package com.luv2code.cruddemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "film")
public class Film {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "hero")
    private String hero;

    @Column(name = "heroine")
    private String heroine;

    @Column(name = "director")
    private String director;

    public Film(){

    }

    public Film(String hero, String heroine, String director) {
        this.hero = hero;
        this.heroine = heroine;
        this.director = director;
    }

    public String getHero() {
        return hero;
    }

    public void sethero(String hero) {
        this.hero=hero;
    }
}

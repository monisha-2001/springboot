package com.in28minutes.learnspringframework.iteration1;

public class Game {
    private TempleGame game;  //this is for this.game


    //constructor
    public Game(TempleGame game) {
        this.game=game;
    }

    public void run() {
        System.out.println("running game: "+ game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}

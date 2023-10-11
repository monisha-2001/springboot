package com.in28minutes.learnspringframework.iteration2;

import com.in28minutes.learnspringframework.iteration1.TempleGame;

public class GameRun {
    private GamingFrame game;  //this is for this.game


    //constructor
    public GameRun(GamingFrame game) {
        this.game=game;
    }

    public void run() {
        System.out.println("running game: "+ game);
        game.up();
        game.down();
    }
}

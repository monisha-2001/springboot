package com.in28minutes.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    private GamingConsole game;  //this is for this.game


    //constructor
    public GameRunner(GamingConsole game) {
        this.game=game;
    }

    public void run() {
        System.out.println("running game: "+game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}

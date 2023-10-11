package com.in28minutes.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

@Component
public class GameRunner {
    private GamingConsole game;  //this is for this.game


    //constructor
    public GameRunner(@Qualifier("superContraGame") GamingConsole game) {
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

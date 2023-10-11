package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.PacmanGame;
import com.in28minutes.learnspringframework.iteration1.Game;
import com.in28minutes.learnspringframework.iteration1.TempleGame;
import com.in28minutes.learnspringframework.iteration2.Candy;
import com.in28minutes.learnspringframework.iteration2.GameRun;
import com.in28minutes.learnspringframework.iteration2.SubWay;

public class App01GamingBasicJava {
    public static void main(String[] args) {

        //var game=new MarioGame();
        //var game=new SuperContraGame();
//        var game=new PacmanGame();   //1: Object Creation
//        var gameRunner=new GameRunner(game); //2: Object creation + Wiring Dependencies
        //game is a dependency on Gamerunner class

//        gameRunner.run();

//        for iteration 01
//        var game=new TempleGame();
//        var gameRun=new Game(game);
//
//        gameRun.run();

//        for iteration 02
//        var game=new SubWay();
        var game=new Candy();
        var gamerun=new GameRun(game);

        gamerun.run();



    }
}

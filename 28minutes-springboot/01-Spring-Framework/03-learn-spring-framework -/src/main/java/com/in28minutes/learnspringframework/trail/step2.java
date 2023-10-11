package com.in28minutes.learnspringframework.trail;

import com.in28minutes.learnspringframework.App03GamingSpringBeans;
import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;
import com.in28minutes.learnspringframework.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class step2 {
    @Bean
    public GamingConsole game(){
        var game=new PacmanGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game){
        var gameRunner=new GameRunner(game);
        return gameRunner;  //or     return new GameRunner(game);
    }
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(step2.class);

        context.getBean(GamingConsole.class).up();

        context.getBean(GameRunner.class).run();
    }
}

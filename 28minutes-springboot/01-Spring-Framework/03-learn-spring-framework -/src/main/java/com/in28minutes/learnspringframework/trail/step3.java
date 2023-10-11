package com.in28minutes.learnspringframework.trail;

import com.in28minutes.learnspringframework.App03GamingSpringBeans;
import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.in28minutes.learnspringframework.game")
public class step3 {

        @Bean
        public GameRunner gameRunner(GamingConsole game){
            var gameRunner=new GameRunner(game);
            return gameRunner;  //or     return new GameRunner(game);
        }
        public static void main(String[] args) {
            var context = new AnnotationConfigApplicationContext(com.in28minutes.learnspringframework.App03GamingSpringBeans.class);

            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();
        }
}

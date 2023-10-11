package com.in28minutes.learnspringframework.game;

public class SuperContraGame implements GamingConsole{

    public void up(){
        System.out.println("PULL");
    }

    public void down(){
        System.out.println("SIT DOWN");
    }

    public void left(){
        System.out.println("GO BACK");
    }

    public void right(){
        System.out.println("WIN");
    }
}

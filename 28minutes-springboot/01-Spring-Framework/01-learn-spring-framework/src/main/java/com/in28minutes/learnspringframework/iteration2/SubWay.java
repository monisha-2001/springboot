package com.in28minutes.learnspringframework.iteration2;

public class SubWay implements GamingFrame{
    @Override
    public void up() {
        System.out.println( "Jump");
    }

    @Override
    public void down() {
        System.out.println("slide");

    }
}

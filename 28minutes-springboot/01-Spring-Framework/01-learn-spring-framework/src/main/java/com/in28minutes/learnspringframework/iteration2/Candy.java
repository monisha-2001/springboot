package com.in28minutes.learnspringframework.iteration2;

public class Candy implements GamingFrame{
    @Override
    public void up() {
        System.out.println("Shift");
    }

    @Override
    public void down() {
        System.out.println("no Shift");

    }
}

package com.monisha;


public class PassingExample {
    public static void main(String[] args) {
        String name="monisha";
        greet(name);
        System.out.println(name); //the name will not change to manoj

    }
    static void greet(String name){

        name="manoj"; //see notes
    }
}

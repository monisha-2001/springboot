package com.monisha;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//        String message=greet();
//        System.out.println(message);

        //passing the argument
//        String mess=greet1("monisha","b");
//        System.out.println(mess);

        //to take user input and then pass
        Scanner in = new Scanner(System.in);
        System.out.println("enter the name");
        String name=in.next();
        String naam=greet2(name);
        System.out.println(naam);

    }

     static String greet2(String a) {
        String message="hello " +a;
        return message;
    }

    static String greet(){
        String greeting="how are you";
        return greeting;
    }

    static String greet1(String a,String b){
        String greeting=a+b;
        return greeting;
    }
}

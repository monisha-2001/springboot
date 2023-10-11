package com.monisha;

import java.util.Scanner;

public class NumberExample {

    //internal working see notes
    public static void main(String[] args) {
        //write a func that takes in a number and prints it
        //print first 5 number: 1 2 3 4 5

        print1(1);

    }
    static void print1(int num) {
        System.out.println(num);
        print2(2);
    }
    static void print2(int num){
        System.out.println(num);
        print3(3);
    }
    static void print3(int num){
        System.out.println(num);
        print4(4);
    }
    static void print4(int num){
        System.out.println(num);
        print5(5);
    }
    static void print5(int num){
        System.out.println(num);
    }

    //in this prog we are writing the funs 5 times wt if we need to write 1000 times
    //then it is difficult
    //so the solu is see waytowriterecursion prog
}

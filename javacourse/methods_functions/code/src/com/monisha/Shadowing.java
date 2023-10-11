package com.monisha;

public class Shadowing {
    static int x=90; //this will be shadowed at line7
    //static int x=100; we get an error bezc within same block we can again use this


    public static void main(String[] args) {
        System.out.println(x); //90
       int  x=40; //the class variable at line 4 is shadowed by this



        //if we write like this means
        //int x;
        //System.out.println(x); we get an error bezc scope will begin when value is initiaized
        // x=40;



        System.out.println(x); //40
        fun();  //fun will take 90 bezc 40 can be used only within this block not outside

    }
    static void fun(){
        System.out.println(x); //90
    }
}

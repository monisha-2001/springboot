package com.monisha;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1,2,3,4,5,6,7,8,9,0); //we can pass any number of arguments

        multiple(10,20,"mo","1");
        //multiple(10,"mo","1",20); error
    }

    //static void multiple(int a,String ...m,int b)   error
    static void multiple(int a,int b,String ...m){
        System.out.println(Arrays.toString(m));

    }
    static void fun(int...m){
        System.out.println(Arrays.toString(m)); //it will give in array form
    }
}

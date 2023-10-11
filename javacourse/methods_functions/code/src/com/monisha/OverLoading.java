package com.monisha;


import java.util.Arrays;

//overloadind occurs at compile time
public class OverLoading {
    public static void main(String[] args) {
        fun(10);
        fun("monisha");
        fun(10,20);

        fun(1,2,3,4,5);
        fun("mo","ma","ga");
        //fun(); we get error called ambiguous bezc when we are doing overloading we need to specify the argumnets
    }

    //varargs
    static void fun(String ...a){
        System.out.println(Arrays.toString(a));
    }

    static void fun(int...a){
        System.out.println(Arrays.toString(a));
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(int a,int b){
        int c=a+b;
        System.out.println(c);
    }
    static void fun(String a){
        System.out.println(a);
    }
}

package com.monisha;

public class Swap {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        swap(10,20);

        swap1(a,b);
        System.out.println(a+" "+b);
        //if i give like this by initializing the variables separetely it won't swap
        //why? see in passingexample

    }
    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+ " "+b);
    }

    static void swap1(int a,int b){
        int temp=a;
        a=b;
        b=temp; //see notes
    }
}

package com.monisha;

public class Comparison {
    public static void main(String[] args) {

        //see notes for working
        String a="kunal";
        String b="kunal";
        String e=a;

        System.out.println(a==b);  //gives true
        System.out.println(e==a);

        //how to make false , create a new object
        String c=new String("kunal");
        String d=new String("kunal");
        System.out.println(c==d); //gives false

        //to compare only value
        System.out.println(c.equals(d));  //gives true
    }
}

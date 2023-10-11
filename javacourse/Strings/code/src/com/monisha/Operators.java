package com.monisha;

import java.util.ArrayList;
import java.util.Arrays;

public class Operators {

    //internal working see notes
    public static void main(String[] args) {
        System.out.println('a'+'b');  //as it is char it prints ascii value

        System.out.println("a"+"b");  //as it isstring it concatenates

        System.out.println('a'+1); //converts 'a' to ascii and add 1
        System.out.println('A'+1);

        System.out.println((char)('a'+1)); //type casting

        System.out.println("a"+1);
        //integer is converted to Integer(rapar class) that will call toString()
        //after few steps it is in the form "a"+"1"

        System.out.println("a"+'a');//prints aa bezc if one of the datatype is string answer will be string


        //complex concatination
        System.out.println("moni"+new ArrayList<>());

        System.out.println("moni"+new Integer(77));

        System.out.println("moni"+new int[]{1,2,3,4,5}); //gives garbage

        System.out.println("moni"+ Arrays.toString(new int[]{1,2,3,4,5}));

       // System.out.println(new Integer(7)+new ArrayList<>());   we get an error
        //bezc  while concatinating atleast one part should or must be string
        //how to make that work then by adding string

        System.out.println(new Integer(7)+" "+new ArrayList<>());

    }
}

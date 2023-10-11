package com.monisha;

import java.util.ArrayList;
import java.util.Arrays;

public class Basics {
    public static void main(String[] args) {

        //see working in notes
        String a="monisha";
        String b="gowda";
        System.out.println(a);

        //create a new object for a
        a="basavaraju";  //now a points to this not monisha and monisha will be grabage
        //here we are creating new object not modifying
        System.out.println(a);


        System.out.println(56);  //it prints 56
        System.out.println("gowda"); //it prints gowda
        System.out.println(new int[]{1,2,3,4,5}); //wt this prints
        //it prints some grabage value bezc  in 56 and gowda "tostring" is inbuilt but in array it is not

        //so we need to explicitly put arrays.tostring  //to get the format of array

        System.out.println(Arrays.toString(new int[]{1,2,3,4,5}));
    }
}

package com.monisha;

import java.util.Arrays;

public class MethodsInString {
    public static void main(String[] args) {
        String str="monisha Gowda";

        System.out.println(Arrays.toString(str.toCharArray()));  //we need to add arrays.tostring to convert into char

        System.out.println(str.toLowerCase());

        System.out.println(str.indexOf('i'));

        System.out.println("     monisha    ".strip());  //it removes spaces at start and end

        System.out.println(Arrays.toString(str.split(" ")));

        //in all these methods new object is created but the str object remauns same as str are immutable

        System.out.println(str);
    }


}

package com.monisha;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        //create an array
        int[] arr={1,2,3,45,6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] num){
        num[0]=99; //if we make a change to the object via this refe vari,same obje will be changed

    }
}

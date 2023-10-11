package com.monisha;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();  //as i'm writing inside main func which is static the func/method should also be static
    }


    static void sum() {   //as i'm mot returing anything void is return
        Scanner in=new Scanner(System.in);
        System.out.println("enter the first number");
        int num1=in.nextInt();
        System.out.println("enter the second number");
        int num2=in.nextInt();
        int sum=num1+num2;
        System.out.println("the sum is "+sum);
    }
}

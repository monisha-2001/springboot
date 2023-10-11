package com.monisha;

import java.util.Scanner;

public class UseOfReturn {
    public static void main(String[] args) {
       int ans=sum(); //int ans=30 it becomes when it returns
        System.out.println(ans);
//        System.out.println(sum());  //1 way

        //for arguments
        int solu=sum2(10,20);
        System.out.println(solu);
    }
    static int sum() {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the first number");
        int num1=in.nextInt();
        System.out.println("enter the second number");
        int num2=in.nextInt();
        int sum=num1+num2;
        return sum;  //10+20=30 30 will be return   //return means func ends
        //anything we write after this is error
    }


    //use of arguments
    //pass the value of the function when you are calling the main()
    static int sum2(int a,int b){
        int sum=a+b;
        return sum;
    }
}

package com.monisha;

import java.util.Scanner;

public class PrimeInMethods {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

        boolean ans=isprime(n);
        System.out.println(ans);

        System.out.println(isArmStrong(n));

//        for(int i=1;i<=1000;i++){
//            if(isArmStrong(i))       //to get to know arm strong numbers
//            System.out.println(i);
//        }

        //prime(n);
    }
//    static void prime(int a){
//        if(a%2==0){
//            System.out.println("Not a prime number");
//        }else{
//            System.out.println("prime number");
//        }

    //another method
    static boolean isprime(int n){ //return true or false
        if(n <=1){
            return false;
        }
        int c=2;
        while(c*c<n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return c*c>n;//7>3 true so it returns true

    }

    //armstrong or not
    static boolean isArmStrong(int n){
        int original = n;
        int sum=0;
        while(n>0){
           int rem=n%10;
           n=n/10;
           sum=sum+rem*rem*rem;
        }
        if(sum==original){   //
            return true;     // these lines we can simply to return sum==original
        }                    //
        return false;        //
    }

}

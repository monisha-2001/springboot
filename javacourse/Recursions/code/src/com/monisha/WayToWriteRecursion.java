package com.monisha;

public class WayToWriteRecursion {
    //to print 1 to 5
    public static void main(String[] args) {
        print(1);
    }
    static void print(int num){
        if(num==5){
            System.out.println(5);
            return;
        }
        System.out.println(num);  // line 13 and 14 remains same for the func till it prints 4
        //but the func to print 5 is not calling next func to print
        //as it is the end, so for to print 5 we write the line 9,10,11

        print(num+1);   // num+1 as it want to print next number
        //recursive call
        //line19: if you are calling the function again and again,you can treat it as a separate call in the stack
    }
}

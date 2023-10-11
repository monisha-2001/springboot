package com.monisha;

public class Scope {
    public static void main(String[] args) {


    swap(10,20);  //method scope



        //block scope
        int a=10;
        int b=20;
        {
           // int a=100; //already initialized outside the block in the same method,hence you cannot initialise again
            //but we can change the value
            a=100; //reassign the origin ref variable to some other value
            int c=99;
            //value initialised in this block,will remain in block
        }
       // System.out.println(c); cannot use outside the block



        //scoping in for loop
        for(int i=0;i<4;i++){
            System.out.println(i);
            int num=900;
        }
      //  System.out.println(i); //we get error


    }

    //method scope
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        //(a,b)this change will only be valid in this function scope only.
    }


}

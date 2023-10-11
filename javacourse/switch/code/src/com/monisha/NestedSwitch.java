package com.monisha;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int empid=in.nextInt();

        switch(empid){
            case 1:
                System.out.println("monisha");
                break;
            case 2:
                System.out.println("manoj");
                break;
            case 3:
                System.out.println("gautham");
                break;
            case 4:
                String dept=in.next();

                System.out.println("empid is 4");

                switch (dept){
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "management":
                        System.out.println("management department");
                        break;
                    default:
                        System.out.println("no dept");
                }
                break;
            default:
                System.out.println("no empid");
        }
    }
}

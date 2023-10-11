package com.monisha;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String fruit=in.next();

//        switch (fruit) {
//            case "mango" -> System.out.println("king");
//            case "apple" -> System.out.println("healthy");
//            case "banana" -> System.out.println("yellow");
////            default -> System.out.println("invalid");
//        switch (fruit){
//            case "mango":
//                System.out.println("king");
//                break;
//            case "apple":
//                System.out.println("healthy");
//                break;
//            case "banana":
//                System.out.println("yellow");
//                break;
//            default:
//                System.out.println("invalid");
//        }

        //how break can e used
        int day=in.nextInt();
        switch(day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("weekday");
                break;
            case 6:
            case 7:
                System.out.println("weekend");
        }

    }
}

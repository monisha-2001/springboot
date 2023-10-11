package com.monisha;

public class PrintingFormat_PlaceHolders {
    public static void main(String[] args) {
        //if i want to print for a 2decimal place ,how i can do
        float f=123.6584f;
        System.out.printf("formatting to 2decimal place %.2f",f);
        System.out.println();
        //when we use float i.e %(place holder) the print should be in printf

        System.out.printf("hello my name is %s and my initial is %c","monisha",'b');
    }



}

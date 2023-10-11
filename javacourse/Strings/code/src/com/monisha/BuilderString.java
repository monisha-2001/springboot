package com.monisha;

public class BuilderString {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            // System.out.println(ch);
            builder.append(ch);  //we are not writing like series=series+ch
            //we are just appending to the same object
        }
        System.out.println(builder);
        //to convert to string altlast use
        System.out.println(builder.toString());


        //differnt methods in builder
        builder.deleteCharAt(1);
        System.out.println(builder);

        builder.reverse();
        System.out.println(builder);
    }
}

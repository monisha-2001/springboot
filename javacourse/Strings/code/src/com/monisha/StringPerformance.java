package com.monisha;

public class StringPerformance {
    public static void main(String[] args) {
        String series="";
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
           // System.out.println(ch);
            series=series+ch;
        }
        System.out.println(series);
        //but this is not good solution  of performance see notes for what the problem here

        //the solu is to use stringbuilder which are mutable
    }
}

package com.monisha;

public class Palindrome {
    public static void main(String[] args) {
        String str="aba";
        System.out.println(ispalindrome(str));
    }
    static boolean ispalindrome(String str){
        if(str==null||str.length()==0){  //write null first always  this is added bezc to avoid index out of bound case
            return true;
        }
        str=str.toLowerCase(); //convert all to lowercase if it contains caps
        for(int i=0;i<str.length()-1;i++){//in string we write str.length()
            int start=str.charAt(i);
            int end=str.charAt(str.length()-1-i);
            if(start!=end){
                return false;
            }
        }
        return true;
    }
}

package com.mtestproject.java;

public class palindrome {
    public static void main(String[] args) {
        String s="LEVEL";
        char[] c=s.toCharArray();
        int start=0;
        int end=s.length()-1;
        boolean ispal=true;

        while(start<end){
            if(c[start]==c[end]){
                start++; end--;
            }else{
                ispal=false;
                break;
            }
        }

        if(ispal==true)
            System.out.println("Given String is pal");
        else
            System.out.println("given string is not pal");

    }
}

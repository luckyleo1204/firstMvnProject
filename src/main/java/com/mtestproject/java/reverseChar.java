package com.mtestproject.java;

public class reverseChar {
    public static void main(String[] args) {
        String s="Murali is great";
        for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(s.length()-1-i));
        }
    }
}

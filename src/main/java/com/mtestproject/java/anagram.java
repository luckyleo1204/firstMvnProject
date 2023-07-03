package com.mtestproject.java;

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String s1="Care"; String s2="Race";
        s1=s1.toLowerCase(); s2=s2.toLowerCase();
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(Arrays.equals(c1,c2)){
            System.out.println("Provided string is anagram");
          }else{
            System.out.println("Provided string is not anagram");
        }
    }
}

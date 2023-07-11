package com.mtestproject.java;

import java.util.HashMap;
import java.util.Map;

public class longestWord {
    public static void main(String[] args) {
        String str="Java is an object oriented programming language";
        System.out.println(findLongestWord(str));
    }

    public static String findLongestWord(String str){
        String s[]=str.split(" ");
        String longest = "";
        int maxlength=0;
        for(String word: s){
            if(word.length()>maxlength){
                maxlength=word.length();
                longest=word;
            }

        }
        return longest;
    }

    public static String findlongestWrd(String str){
        String s[]=str.split(" ");
        Map<String,Integer> map=new HashMap<>();
        for(String i: s){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        return null;
    }
}

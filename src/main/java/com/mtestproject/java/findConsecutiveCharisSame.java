package com.mtestproject.java;

public class findConsecutiveCharisSame {
    public static void main(String[] args) {
        String isSame1="AB";
        if(hasConCharSame(isSame1)){
            System.out.println("Given string has same chars");
        }else{
            System.out.println("Given string has not same chars");
        }

    }

    public static boolean hasConCharSame(String s){
        boolean isSame=false;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                isSame=true;
            }
        }
        return isSame;
    }
}



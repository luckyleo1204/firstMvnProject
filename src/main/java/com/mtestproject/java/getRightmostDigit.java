package com.mtestproject.java;

public class getRightmostDigit {
    public static void main(String[] args) {
        String x="I bought 5 apples, 4 bananas, and 3 oranges";
        System.out.println(getRightmostDigi(x));

    }

    public static int getRightmostDigi(String str) {

        for(int i=str.length()-1;i>=0;i--){
            char x=str.charAt(i);

            if( Character.isDigit(x)){
                return  Character.getNumericValue(x);
            }

        }
       return -1;

    }
}

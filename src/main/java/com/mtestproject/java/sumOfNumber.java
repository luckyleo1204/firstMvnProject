package com.mtestproject.java;

public class sumOfNumber {
    public static void main(String[] args) {
        int x=1234566678, sum=0;
        while(x>0){
            int rem=x%10;
            sum+=rem;
            x=x/10;
        }
        System.out.println(sum);

    }
}

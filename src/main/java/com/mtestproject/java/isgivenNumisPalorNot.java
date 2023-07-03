package com.mtestproject.java;

public class isgivenNumisPalorNot {
    public static void main(String[] args) {
        int x=121, sum=0, temp=x;
        while(x>0){
            int rem=x%10;
            sum=(sum*10)+rem;
            x=x/10;
        }

        if(sum==temp)
            System.out.println("given number is pal");
        else
            System.out.println("given number is not pal");

    }
}

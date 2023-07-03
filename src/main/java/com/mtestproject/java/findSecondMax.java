package com.mtestproject.java;

public class findSecondMax {
    public static void main(String[] args) {
        int a[]={1,2,4,6,88,99,22,89};
        int max = 0, min=0;
        for( int i: a){
            if(i>max){
                min=max;
                max=i;
            }else if(i<max && i>min) {
                min=i;
            }
        }

        System.out.println("Max Number is==>"+max+"\n"+ "Second Max==>"+min);
    }
}

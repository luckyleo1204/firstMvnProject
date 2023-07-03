package com.mtestproject.java8Concepts;

public class ThreadDemoWithLambda {
    public static void main(String[] args) {
        Runnable r=()->{
            for(int i=0;i<10;i++){
                System.out.println("In Child Thread");
            }
        };
        Thread t=new Thread(r);
        t.start();
        for(int i=0;i<10;i++){
            System.out.println("In Main Thread");
        }
    }
}

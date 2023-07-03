package com.mtestproject.java8Concepts;

public class ThreadDemo {

    public static void main(String[] args) {
        Runnable mt=new myThread();
        Thread t=new Thread(mt);
        t.start();
        for(int i=0;i<10;i++){
            System.out.println("In Main Thread");
        }
    }


}


class myThread implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("In child Thread");
        }
    }
}
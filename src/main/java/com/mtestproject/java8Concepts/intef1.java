package com.mtestproject.java8Concepts;

public interface intef1 {

    public void m1();
}
class Demo implements intef1 {
    public void m1(){
        System.out.println("Impmentation of m1 menthod");
    }
}

class Test{
    public static void main(String[] args) {
        intef1 i=new Demo();
        i.m1();
    }
}
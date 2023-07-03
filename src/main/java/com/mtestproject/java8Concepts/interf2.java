package com.mtestproject.java8Concepts;

public interface interf2 {

    public void m1();
}

class Test2{
    public static void main(String[] args) {
        interf2 i=()-> System.out.println("Implemenation of abstract method of m1 using java 8");
        i.m1();
    }
}

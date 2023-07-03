package com.mtestproject.java8Concepts;

public interface interf3 {
    public void add(int a, int b);
}

class Test3 {
    public static void main(String[] args) {
        interf3 i3 = (a, b) -> System.out.println("Addition of 2 numbers: " + (a + b));
        i3.add(2, 5);
        i3.add(200, 300);
    }
}

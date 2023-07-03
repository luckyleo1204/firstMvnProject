package com.mtestproject.java8Concepts;

import java.util.TreeSet;

public class SortingTreeSetinAscUsingLambda {
    public static void main(String[] args) {
        TreeSet<Integer> ts=new TreeSet<>((i1,i2)->i1>i2?-1:i1<i2?1:0);
        ts.add(25);
        ts.add(15);
        ts.add(0);
        ts.add(10);
        ts.add(5);
        System.out.println(ts);
    }
}

package com.mtestproject.java8Concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class sortListinDecese {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(10);
        al.add(4);
        al.add(1);
        al.add(23);
        al.add(2);
        System.out.println(al);
        System.out.println("\n========After defualt Sorting=========\n");
        Collections.sort(al);
        System.out.println(al);
        System.out.println("\n========After Ascending Sorting=========\n");
        Collections.sort(al,new mysorting());
        System.out.println(al);
    }
}

class mysorting implements Comparator<Integer> {

    public int compare(Integer i1, Integer i2){
        return i1>i2?-1:i1<i2?1:0;
    }

}
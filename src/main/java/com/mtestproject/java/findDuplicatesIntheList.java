package com.mtestproject.java;

import com.beust.ah.A;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class findDuplicatesIntheList {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>(Arrays.asList(12,33,44,55,66,01,2,12,3,88));
        ArrayList<Double> dl=new ArrayList<>(Arrays.asList(12.0,33.5,44.7,55.0,66.3,01.01,2.02,12.0,3.1,88.0));
        System.out.println("\nOriginal Array List\n");
        dl.forEach(n-> System.out.print(n+"\t"));
        System.out.println("\nAfter Removing duplicate Array List\n");
        dl=removeDup(dl);
        dl.forEach(n-> System.out.print(n+"\t"));

    }

    public static <T> ArrayList<T> removeDup(ArrayList<T> t){
       // Set<T> newset=new HashSet<>();
        ArrayList<T> newList=new ArrayList<>();
        for(T i: t){
            if(!newList.contains(i)){
                newList.add(i);
            }
        }
        return newList;
    }
}

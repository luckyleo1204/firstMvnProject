package com.mtestproject.java8Concepts.mapdemo;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class sortMapDefuatl {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(101, "Murali");
        map.put(121, "Harshi");
        map.put(111, "Kushi");
        System.out.println("\n======================Sort by Key ================\n");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        //Reverse Order
        System.out.println("\n======================Sort by Key  reverse================\n");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
        System.out.println("\n======================Sort by value ================\n");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
        System.out.println("\n======================Sort by value Reverse================\n");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);



    }
}

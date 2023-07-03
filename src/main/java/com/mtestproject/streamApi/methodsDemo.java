package com.mtestproject.streamApi;

import java.util.List;
import java.util.stream.Collectors;

public class methodsDemo {
    public static void main(String[] args) {
      List<String> list= List.of("Murali","Mahesh","Kushi", "Little");
      List<String> al=list.stream().filter(e->e.startsWith("M")).collect(Collectors.toList());
        System.out.println(al);
        System.out.println("\n========================================\n");
        list.stream().filter((e->e.startsWith("K"))).forEach(e-> System.out.println(e));
        System.out.println("\n========================================\n");

        //Map example
        List<Integer> list1=List.of(2,44,55,21,4,99,77,34);
        list1.stream().map(e->e*e).forEach(e-> System.out.println(e));
        System.out.println("\n========================================\n");
        List<Integer> list2=List.of(2,44,55,21,4,99,2,55,77,34);
       // list2.stream().filter(e->e.);


    }
}

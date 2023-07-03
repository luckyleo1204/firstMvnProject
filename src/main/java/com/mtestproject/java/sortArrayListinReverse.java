package com.mtestproject.java;

import java.util.ArrayList;
import java.util.Collections;

public class sortArrayListinReverse {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        // Adding elements to the ArrayList
        list.add(410);
        list.add(250);
        list.add(144);
        list.add(967);
        list.add(289);
        list.add(315);

        Collections.sort(list);
        for(int i : list)
            System.out.print(i+"\t");
        System.out.println("\n============================================\n");
        Collections.sort(list, Collections.reverseOrder());
        for(int i : list)
            System.out.print(i+"\t");
    }
}

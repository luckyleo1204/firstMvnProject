package com.mtestproject.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class JavaProgramtoEmptyArrayList {
    public static void main(String[] args) {
        ArrayList<String> al =new ArrayList<>(Arrays.asList("Murali","KAvitha","Harshi"));
        // empty arraylist using clear method.
        al.clear();
        for(String i: al){
            System.out.println(i);
        }

        ArrayList<String> al1 =new ArrayList<>(Arrays.asList("Murali","KAvitha","Harshi"));
        // empty arraylist using clear method.
       al1.removeAll(al1);
        for(String i: al1){
            System.out.println(i);
        }
    }
}

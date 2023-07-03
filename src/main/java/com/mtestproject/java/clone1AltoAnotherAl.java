package com.mtestproject.java;

import java.util.ArrayList;
import java.util.Arrays;

public class clone1AltoAnotherAl {
    public static void main(String[] args) {
        ArrayList<String> al =new ArrayList<>(Arrays.asList("Murali","KAvitha","Harshi"));
        ArrayList<String> bl=new ArrayList<>();
      //First approach : Copy Elements of One ArrayList to Another ArrayList in Java
        bl.addAll(al);
        for(String i: bl)
            System.out.println(i);
        // Second approach
        System.out.println("\n====================================Second Approach=======================\n");
       bl=(ArrayList<String>) al.clone();
        for(String i: bl)
            System.out.println(i);

    }
}

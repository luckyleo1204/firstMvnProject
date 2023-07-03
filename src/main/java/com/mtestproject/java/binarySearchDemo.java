package com.mtestproject.java;

import java.util.ArrayList;
import java.util.Collections;

public class binarySearchDemo {
    public static void main(String[] args) {
        BinarySearch ob = new BinarySearch();
        ArrayList<Integer> arr = new ArrayList<Integer>();

        arr.add(5);
        arr.add(10);
        arr.add(15);
        arr.add(20);
        arr.add(25);
        arr.add(30);
        arr.add(35);

        // Initializing the key to be found.
        int x = 10;
        int n=arr.size();
        //int result = ob.binarySearch(arr,0,n-1,x);
        int result= Collections.binarySearch(arr,x);

//        if (result == -1)
//            System.out.println("Element not present");
//        else
//            System.out.println("The Element " + x + " is found at "
//                    + "index " + result);
    }
}

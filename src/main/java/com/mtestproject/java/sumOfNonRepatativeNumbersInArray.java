package com.mtestproject.java;

import java.util.*;

public class sumOfNonRepatativeNumbersInArray {

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 3, 1, 1, 4, 5, 6);
        int n = arr.size();
        System.out.println(sumOfElements(arr, n));
    }

    private static int sumOfElements(List<Integer> arr, int n) {
        Map<Integer,Integer> freq=new HashMap<>();
        for(int i=0;i<n;i++) {
            freq.put(arr.get(i), freq.getOrDefault(arr.get(i), 0) + 1);
        }
            List<Integer> lis = new ArrayList<>();
            for(Map.Entry<Integer, Integer> entry : freq.entrySet()) {
                lis.add(entry.getKey());
            }
            int sum = 0;
            for(int j=0; j<lis.size(); j++) {
                sum += lis.get(j);
            }

            return sum;

        }}





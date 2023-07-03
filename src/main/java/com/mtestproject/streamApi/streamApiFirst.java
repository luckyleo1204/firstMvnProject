package com.mtestproject.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class streamApiFirst {
    public static void main(String[] args) {
        List<Integer> list=List.of(2,44,55,21,4,99,77,34);
        //Older way to filter even number from list.
        List<Integer> newList=new ArrayList<>();
        for(Integer i:list){
            if(i%2==0){
                newList.add(i);
            }
        }
        System.out.println(newList);

        //With Stream API :

        List<Integer> newList8=list.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(newList8);
    }
}
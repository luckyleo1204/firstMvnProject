package com.mtestproject.java;

import javax.sound.midi.Soundbank;
import java.util.*;

public class countTheOccurance {
    public static void main(String[] args) {
        Integer[] a={1, 13, 4, 1, 41, 31, 31, 4, 13, 2 };
        String[] b={"Murali", "Test", "Test","Harshi","Murali"};
        ArrayList<Integer> al=new ArrayList<>(Arrays.asList(a));
        al.forEach(n-> System.out.println(n));
        System.out.println("\n=================================================\n");
        Map<Integer, Integer> map=new HashMap<>();
        for (int i = 0; i < al.size(); i++){
           map.putIfAbsent(al.get(i), Collections.frequency(
                   al, al.get(i)));
        }
        System.out.print(map+"\t");
        stringOccurance(b);

    }

    public static void stringOccurance(String[] s){
        ArrayList<String> str=new ArrayList<>(Arrays.asList(s));
        System.out.println("\n=================================================\n");
        str.forEach(n-> System.out.print(n+"\t"));
        Map<String,Integer> map1=new HashMap<>();
        for(String i: str){
            if(map1.containsKey(i))
                map1.put(i,map1.get(i)+1);
            else
                map1.put(i,1);
        }
        System.out.println("\n=================================================\n");

        for(String i: map1.keySet()){
            System.out.print(i+":"+map1.get(i)+"\t");
        }

    }
}

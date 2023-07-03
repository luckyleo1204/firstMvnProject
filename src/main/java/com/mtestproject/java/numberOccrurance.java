package com.mtestproject.java;

import java.util.HashMap;
import java.util.Map;

public class numberOccrurance {
    public static void main(String[] args) {
        String s="TESTING";
        char[] c=s.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for(char i:c){
            if(map.containsKey(i)==true){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }

        }
        for(Character i: map.keySet()){
            System.out.print(i+":"+map.get(i)+"\t");
        }

    }
}

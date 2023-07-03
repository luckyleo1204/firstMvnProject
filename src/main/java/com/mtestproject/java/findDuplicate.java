package com.mtestproject.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class findDuplicate {
    public static void main(String[] args) {
        String s="java2novoice";
        char[] c=s.toCharArray();
        Map<Character, Integer> map=new HashMap<>();
        for(char i : c){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        for(char j: map.keySet()){
            if(map.get(j)>1){
                System.out.print(j+ ":"+map.get(j)+"\t");
            }
        }
    }
}

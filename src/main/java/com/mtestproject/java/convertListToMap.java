package com.mtestproject.java;

import java.util.*;
import java.util.stream.Collectors;

public class convertListToMap {
    public static void main(String[] args) {
        List<stud> al=new ArrayList<stud>();
        al.add(new stud(100,  "ABCD"));
        al.add(new stud(200,  "JKLM"));
        al.add(new stud(253,  "ZEE"));
        al.add(new stud(139,  "GEM"));

        Map<Integer, String> map=new HashMap<>();
       for(stud i : al){
           map.put(i.getId(), i.getName());
       }
        System.out.println(map);

       //Approach 2:
       LinkedHashMap<Integer,String> lmap= al.stream().collect(Collectors.toMap
               (stud::getId,stud::getName, (x,y)->x+", "+y, LinkedHashMap::new));

       lmap.forEach((x,y)-> System.out.println(x+"="+y));

    }
}

class stud{
    private int id;
    private String name;

    public stud(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "stud{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
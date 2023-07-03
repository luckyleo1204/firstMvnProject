package com.mtestproject.java;

import java.util.ArrayList;
import java.util.Collections;

public class comparatorDemo {
    public static void main(String[] args) {
        ArrayList<student> al=new ArrayList<>();
        al.add(new student("Raj",20,487));
        al.add(new student("Sham",2,745));
        al.add(new student("Zoom",9,982));
        al.add(new student("Kam",12,555));

        Collections.sort(al, (s1,s2) -> {
            return s1.id>s2.id?1:s1.id<s2.id?-1:0;}
        );
        System.out.println("\n========================Sort by Id========================\n");
        al.forEach(n-> System.out.println(n));

        Collections.sort(al,(s1,s2)->s1.name.compareTo(s2.getName()));
        System.out.println("\n========================Sort by name========================\n");
        al.forEach(n-> System.out.println(n));

        Collections.sort(al,(s1,s2)->s1.getMarks()-s2.getMarks());
        System.out.println("\n========================Sort by marks========================\n");
        al.forEach(n-> System.out.println(n));
    }
}
class student{
    public String name;
    public int id, marks;

    public student(String name, int id, int marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getMarks() {
        return marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", marks=" + marks +
                '}';
    }
}
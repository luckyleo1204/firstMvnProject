package com.mtestproject.java8Concepts.mapdemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mapExampleDemo {
    public static void main(String[] args) {
        Map<Integer, Book> map = new HashMap<Integer, Book>();
        Book b1 = new Book(101, "Let us C", "YK", "BPB", 90);
        Book b2 = new Book(202, "Let us Java", "MK", "Wiley", 25);
        Book b3 = new Book(302, "Let us C#", "ZEE", "Nar", 9);
        Book b4 = new Book(152, "Let us Java Script", "ABC", "LMN", 11);
        map.put(1, b1);
        map.put(2, b1);
        map.put(3, b1);
        map.put(4, b1);

        for (Map.Entry<Integer, Book> i : map.entrySet()) {
            int key = i.getKey();
            Book b = i.getValue();
            System.out.println(key + "Details");
            System.out.println(b.id + "\t" + b.name + "\t" + b.author + "\t" + b.publisher + "\t" + b.quantity + "\t");
        }
    }

}

class Book {
    int id;
    String name, author, publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
package com.mtestproject.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class comparatorDemo1 {
    public static void main(String[] args) {

        ArrayList<Car> c = new ArrayList<Car>();
        c.add(new Car(2018, "Kia", 20));
        c.add(new Car(2020, "MG", 13));
        c.add(new Car(2013, "creta", 10));
        c.add(new Car(2015, "BMW", 50));
        c.add(new Car(2017, "Audi", 45));

        // Call the sort function
        Collections.sort(c, new StockComparator());
        for(Car i:c){
            System.out.println(i.toString());
        }
        System.out.println("\n===========================Name Comparator===============\n");
        Collections.sort(c, new NameComparator());
        for(Car i: c)
            System.out.println(i.toString());
    }
}
class Car {
    int ModalNo;
    String name;
    int stock;

    // Parameterized constructor
    Car(int ModalNo, String name, int stock)
    {
        this.ModalNo = ModalNo;
        this.name = name;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Car{" +
                "ModalNo=" + ModalNo +
                ", name='" + name + '\'' +
                ", stock=" + stock +
                '}';
    }
}

class StockComparator implements Comparator<Car> {

    // Function to compare
    public int compare(Car c1, Car c2)
    {
        if (c1.stock == c2.stock)
            return 0;
        else if (c1.stock > c2.stock)
            return 1;
        else
            return -1;
    }
}

class NameComparator implements Comparator<Car>{


    @Override
    public int compare(Car o1, Car o2) {
        return o1.name.compareTo(o2.name);
    }
}
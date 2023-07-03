package com.mtestproject.streamApi;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class streamObject {
    public static void main(String[] args) {
        //Type 1: to create Stream Object
       Stream<Objects> emptyStream= Stream.empty();

       //Type 2:
        String name[]={"Murali","ravi","Main","Ramesh"};
        Stream<String> st1=Stream.of(name);
        st1.forEach(i->{
            System.out.println(i);
        });
        System.out.println("\n========================================\n");

        //Type 3
        Stream<Object> st3=Stream.builder().build();
        System.out.println("\n========================================\n");

        // Type 4:
        IntStream st4= Arrays.stream(new int[]{2,44,55,21,4,99,77,34});
        st4.forEach(e->{
            System.out.println(e);
        });
        System.out.println("\n========================================\n");
        //Type 5: list,set
        List<Integer> list=List.of(2,44,55,21,4,99,77,34);
        list.stream().forEach(e->{
            System.out.println(e);
        });
        System.out.println("\n========================================\n");

    }
}

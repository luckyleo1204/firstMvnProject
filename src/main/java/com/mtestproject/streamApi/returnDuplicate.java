package com.mtestproject.streamApi;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class returnDuplicate {
    public static void main(String[] args) {
        List<Integer> al=List.of(111,2,3,4,1,2,3,55,22);
        //approach 1:
        Set<Integer> set1=new HashSet<>();
        al.stream().filter(e->!set1.add(e)).collect(Collectors.toSet()).forEach(e-> System.out.println(e));

        //Approach 2:
        al.stream().collect(
                Collectors.groupingBy(Function.identity(),
                        Collectors.counting())).entrySet()
                .stream()

                // Check if frequency > 1
                // for duplicate elements
                .filter(m -> m.getValue() > 1)

                // Find such elements
                .map(Map.Entry::getKey)

                // And Collect them in a Set
                .collect(Collectors.toSet()).forEach(e-> System.out.println(e));

        //Approach 3:
        al.stream()

                // Count the frequency of each element
                // and filter the elements
                // with frequency > 1
                .filter(i -> Collections.frequency(al, i) > 1)

                // And Collect them in a Set
                .collect(Collectors.toSet()).forEach(e-> System.out.println(e));
    }
}

package com.iroshnk.java.json;

import java.util.Arrays;
import java.util.List;

/**
 * Created by HP on 1/2/2018.
 */
public class Class1 {
    public static void main(String[] args) {
        List<String> myList =
                Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList.stream()
                /*.filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                */.forEach(System.out::println);
    }
}

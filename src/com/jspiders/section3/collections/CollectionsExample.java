package com.jspiders.section3.collections;

import java.util.*;

public class CollectionsExample {
    public static void main() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);

        Collections.sort(numbers); // sort
        System.out.println(numbers);

        Collections.reverse(numbers); // reverse
        System.out.println(numbers);

        int max = Collections.max(numbers); // max element
        System.out.println("Max: " + max);
    }
}


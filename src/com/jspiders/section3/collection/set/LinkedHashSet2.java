package com.jspiders.section3.collection.set;

import java.util.*;

public class LinkedHashSet2 {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        System.out.println("Set: " + set);           // [Apple, Banana, Orange]
        System.out.println("Size: " + set.size());   // 3
        System.out.println("Contains Banana? " + set.contains("Banana")); // true

        set.remove("Banana");
        System.out.println("After remove: " + set);  // [Apple, Orange]

        LinkedHashSet<String> other = new LinkedHashSet<>();
        other.add("Orange");
        other.add("Grapes");

        set.retainAll(other); // intersection
        System.out.println("After retainAll: " + set); // [Orange]

        set.clear();
        System.out.println("Is empty? " + set.isEmpty()); // true
    }
}


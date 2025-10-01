package com.jspiders.section3.collection.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet1 {
     static void main() {
        Set<String> s1 = new TreeSet<>();
        s1.add("A");
        s1.add("D");
        s1.add("C");
        s1.add("E");
        s1.add("B");
        /*
        1. s1.add(null); JVM throws NullPointerException
        2. Duplicates are not allowed
        3. There is no index
        4. Binary Search tree is the underlying Data structure
        5. Insertion order is not preserved
        6. insert - add() , read - for each or iterator, update - logic, Delete - remove(), Search - contains(), element count - size()
        7. Not Thread Safe
        8. It is sorted
        9. search operation is FAST
        10. add operation is slow
        */
         String s = "B";
        String v = "A";
        System.out.println(s.compareTo(v));

        for (String ser : s1){
            System.out.println(ser);
        }

        System.out.println(s1);
    }
}

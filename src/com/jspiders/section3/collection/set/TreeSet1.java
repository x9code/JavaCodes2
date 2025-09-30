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
        //s1.add(null); JVM throws NullPointerException
        //Duplicates are not allowed
        String s = "B";
        String v = "A";
        System.out.println(s.compareTo(v));

        for (String ser : s1){
            System.out.println(ser);
        }

        System.out.println(s1);
    }
}

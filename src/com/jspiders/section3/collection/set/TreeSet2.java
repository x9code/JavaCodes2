package com.jspiders.section3.collection.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class DescOrder implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
        int v = s2.compareTo(s1);
        return v;
    }
}

public class TreeSet2 {
    public static void main(String[] args) {
        DescOrder d1 = new DescOrder();
        Set<String> s1 = new TreeSet<>(d1);
        s1.add("A");
        s1.add("D");
        s1.add("C");
        s1.add("E");
        s1.add("B");

        for(String j : s1){
            System.out.println(j);
        }
    }
}

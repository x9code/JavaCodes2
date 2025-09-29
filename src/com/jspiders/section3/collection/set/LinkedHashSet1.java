package com.jspiders.section3.collection.set;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> l1 = new LinkedHashSet<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        l1.add(null);

        for(Integer i : l1){
            System.out.println("Elements in linkedhashset : "+i);
        }

    }
}

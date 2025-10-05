package com.jspiders.section3.collection.generics;

import java.util.ArrayList;

public class Generic1 {
    static void main() {
        ArrayList a1 = new ArrayList();
        a1.add(10);
        a1.add("hello");

        System.out.println(a1);
        ArrayList<String> a2 = new ArrayList<>();
        a2.add("hello");
        a2.add("10");

        System.out.println(a2);
    }
}

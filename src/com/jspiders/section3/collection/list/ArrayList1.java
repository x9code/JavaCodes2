package com.jspiders.section3.collection.list;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        a1.add(10); //a1[0] = 10;
        a1.add(20);//auto-boxing
        a1.add(null);
        a1.add(30);
        a1.add(30);
        a1.add(40);
        a1.add(null);
        a1.add(50);

        System.out.println("a1 contains " + a1.size());

        System.out.println(a1.get(0));

        //int ub = a1.size();

        for (Object o : a1) {
            System.out.println(o);
        }
    }
}

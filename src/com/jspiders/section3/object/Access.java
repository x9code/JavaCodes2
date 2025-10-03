package com.jspiders.section3.object;

public class Access {
    public static void main(String[] args) {

        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1.hashCode());
        System.out.println(obj1.toString());
        System.out.println(obj1.equals(obj2));


    }
}

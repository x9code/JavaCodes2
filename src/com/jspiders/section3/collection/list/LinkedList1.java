package com.jspiders.section3.collection.list;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);   list.add(20);    list.add(30);    list.add(40);    list.add(50);

        System.out.println("Size of list :"+list.size());

        while(!list.isEmpty()){
            System.out.println( list.poll());
        }
        System.out.println("Size of list after poll :"+list.size());

    }
}

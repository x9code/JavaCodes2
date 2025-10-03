package com.jspiders.section3.collection.map;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTableAndHashMap {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht = new Hashtable<>();
        ht.put(1,"A");
        ht.put(2,"D");
        ht.put(3,"B");
        ht.put(4,"E");
        ht.put(5,"C");
        System.out.println("hashtable - >"+ht);

        System.out.println("-------------------------------------");

        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1,"A");
        hm.put(2,"C");
        hm.put(3,"B");
        hm.put(4,"E");
        hm.put(5,"D");
        System.out.println("hashMAP - >"+hm);
    }
}

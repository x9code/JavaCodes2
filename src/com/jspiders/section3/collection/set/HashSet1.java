package com.jspiders.section3.collection.set;
import java.util.HashSet;

public class HashSet1 {
     static void main(String[] a) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10); //set[0] = 10;
        set.add(20);//auto-boxing
        set.add(null);
        set.add(31);
        set.add(30);
        set.add(41);
        set.add(null);
        set.add(50);
        for( Integer i : set){
            System.out.println(i);
        }
//        for (Integer val : set){
//            if(val != null && val%2==0){
//                System.out.println(val);
//            }

    }
}

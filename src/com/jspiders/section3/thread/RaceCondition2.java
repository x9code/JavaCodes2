package com.jspiders.section3.thread;

import java.util.ArrayList;

public class RaceCondition2 {
    static void main() {
        System.out.println("main starts....");
        ArrayList<Integer> list = new ArrayList<>();
       // System.out.println("adding objects..");
        System.out.println("size :"+list.size());
        Runnable task = ()->{
        synchronized (list) {
            for (int i = 1; i <= 100; i++) {
                list.add(i);
            }
        }
            System.out.println("size :"+list.size());
        };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
        System.out.println("main ends .....");

    }
}

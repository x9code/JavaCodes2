package com.jspiders.section3.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread4 {
    static void main() {
        System.out.println("main  starts....");
        ExecutorService es1 = Executors.newCachedThreadPool();
        Runnable task1 = ()->{
            System.out.println("running task1");
        };
        for(int i =1 ;i<=3;i++){
            es1.submit(task1);
        }
        es1.shutdown();
        System.out.println("main ends.......");
    }
}

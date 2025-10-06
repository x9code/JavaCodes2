package com.jspiders.section3.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread5 {
    static void main() {
        System.out.println("main starts....");
        int thread = Runtime.getRuntime().availableProcessors();
        System.out.println("no of threads: "+thread);
        ExecutorService es1 = Executors.newScheduledThreadPool(thread);
        Runnable task1 = ()->{
            System.out.println("running task1");
        };
        for(int i =1 ;i<=3;i++){
            es1.submit(task1);
        }
        es1.shutdown();
        System.out.println("main ends......");
    }
}

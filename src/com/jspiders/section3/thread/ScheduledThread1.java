package com.jspiders.section3.thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThread1 {
    static void main() {
        System.out.println("main starts....");
        int thread = Runtime.getRuntime().availableProcessors();
        ScheduledExecutorService es1 = Executors.newScheduledThreadPool(thread);
        Runnable task1 = ()->{
            System.out.println("running task1");
        };
        for(int i =1;i<=2;i++){
            es1.submit(task1);
        }
        es1.shutdown();

        System.out.println("main ends....");
    }
}

package com.jspiders.section3.thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThread3 {
    static void main() {
        System.out.println("main starts.........");
        int thread = Runtime.getRuntime().availableProcessors();
        ScheduledExecutorService es1 = Executors.newScheduledThreadPool(thread);
        Runnable task1 = ()->{
            System.out.println("running task1");
        };
        es1.scheduleWithFixedDelay(task1,0,3, TimeUnit.SECONDS);

    }
}

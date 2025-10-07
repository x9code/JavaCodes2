package com.jspiders.section3.thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThread2 {
    static void main() {
        System.out.println("main starts....");
        int thread = Runtime.getRuntime().availableProcessors();
        System.out.println(STR."no of threads: \{thread}");
        ScheduledExecutorService es1 = Executors.newScheduledThreadPool(thread);
        Runnable task1 = ()->{
            System.out.println("running task1");
        };
        es1.scheduleAtFixedRate(task1,0,5, TimeUnit.SECONDS);
        //es1.shutdown();
    }
}

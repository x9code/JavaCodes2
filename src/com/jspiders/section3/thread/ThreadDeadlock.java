package com.jspiders.section3.thread;

public class ThreadDeadlock {
    static void main() {
        System.out.println("Main starts...");

        String s1 = new String("hello");
        String s2 = new String("world");

        Runnable task1 = ()-> {
            System.out.println("Thread-1 starts...");
            System.out.println("Thread-1 waiting to lock s1");
            synchronized (s1) {
                System.out.println("Thread-1 LOCKED s1");
                System.out.println("Thread-1 -> s1 : "+s1);
                System.out.println("Thread-1 waiting to lock s2");
                try {
                    System.out.println("Thread-1 paused the execution");
                    s1.wait();
                    System.out.println("Thread-1 resume the execution");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (s2) {
                    System.out.println("Thread-1 LOCKED s2");
                    System.out.println("Thread-1 -> s2 : "+s2);
                    System.out.println("Thread-1 UNLOCKS s2");
                }
                System.out.println("Thread-1 UNLOCKS s1");
            }
            System.out.println("Thread-1 ends...");
        };

        Runnable task2 = ()-> {
            System.out.println("Thread-2 starts...");
            System.out.println("Thread-2 waiting to lock s2");
            synchronized (s2) {
                System.out.println("Thread-2 LOCKED s2");
                System.out.println("Thread-2 -> s2 : "+s2);
                System.out.println("Thread-2 waiting to lock s1");
                synchronized (s1) {
                    System.out.println("Thread-2 LOCKED s1");
                    System.out.println("Thread-2 -> s1 : "+s1);
                    System.out.println("Thread-2 UNLOCKS s1");
                    s1.notify();
                    System.out.println("Thread-2 notify() Thread-1");
                }

                System.out.println("Thread-2 UNLOCKS s2");
            }
            System.out.println("Thread-2 ends...");
        };



        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();


        System.out.println("Main ends...");
    }
}

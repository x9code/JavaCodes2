package com.jspiders.section3.thread;

class Counter {
    private int value = 0;

    synchronized public void increment(){
        value++;
    }
    synchronized public void decrement(){
        value--;
    }
    synchronized public void showValue(){
        System.out.println(value);
    }

}
public class RaceCondition1{
    static void main() {
        System.out.println("man starts...");
        Counter c1 = new Counter();
        c1.showValue();
        Runnable task1 = ()->{
            System.out.println("thread 1 Starts....");
            c1.increment();
            c1.showValue();
            System.out.println("Thread1 ends.......");
        };
        Runnable task2 = ()->{
            System.out.println("Thread2 starts......");
            c1.decrement();
            c1.showValue();
            System.out.println("Thread2 ends........");
        };
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        thread1.start();
        thread2.start();
        System.out.println("main ends.....");
    }

}

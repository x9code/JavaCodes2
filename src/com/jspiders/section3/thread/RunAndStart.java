package com.jspiders.section3.thread;

class MyThread extends Thread {
    public void run() {
        System.out.println("Running in : " + Thread.currentThread().getName()+" Thread");
    }
}
public class RunAndStart {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start(); // Creates new thread
        t1.run();   // Executes in main thread
    }
}


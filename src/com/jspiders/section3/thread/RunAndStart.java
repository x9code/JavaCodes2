package com.jspiders.section3.thread;

class MyThread1 extends Thread {
    public void run() {
        System.out.println("Running in : " + Thread.currentThread().getName()+" Thread");
    }
}
class MyThread2 implements Runnable{
    public void run(){
        System.out.println("Running in : "+Thread.currentThread().getName()+" Thread");
    }
}
public class RunAndStart {
    public static void main(String[] args) {
        MyThread1 mt1 = new MyThread1();
        mt1.start(); // Creates new thread
        mt1.run();   // Executes in main thread
        MyThread2 mt2 = new MyThread2();
        Thread t1 = new Thread(mt2);
        t1.start();
    }
}


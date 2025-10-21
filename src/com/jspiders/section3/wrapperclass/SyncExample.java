package com.jspiders.section3.wrapperclass;

class Table {
    synchronized void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try { Thread.sleep(400); } catch (Exception e) {}
        }
    }
}

class MyThread1 extends Thread {
    Table t;
    MyThread1(Table t) { this.t = t; }
    public void run() { t.printTable(5); }
}

class MyThread2 extends Thread {
    Table t;
    MyThread2(Table t) { this.t = t; }
    public void run() { t.printTable(100); }
}

public class SyncExample {
    public static void main(String[] args) {
        Table obj = new Table();
        new MyThread1(obj).start();
        new MyThread2(obj).start();
    }
}


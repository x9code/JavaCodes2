package com.jspiders.section3.exceptionclasses;

public class CheckedException {
    public static void test() throws InterruptedException {
        Thread.sleep(200);
    }

    public static void main(String[] args) {
        try {
            test();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
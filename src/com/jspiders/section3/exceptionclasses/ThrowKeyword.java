package com.jspiders.section3.exceptionclasses;

public class ThrowKeyword {
    public static void test(int a, int b) throws IllegalArgumentException{
        if(b==0) {
            throw new IllegalArgumentException("Invalid input : " + b);
        }
        int res = a / b;
        System.out.println("Result is : "+res);
    }

    public static void main(String[] args) {
        System.out.println("Starts ...");
        try {
            test(2, 0);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Ends......");
    }
}

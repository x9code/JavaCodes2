package com.jspiders.packages.p1;

public class Demo {
    public int v1 = 20;
    protected double v2 = 4.5;
    long v3 = 34554l;
    private String v4 = "Hello";
    public void test1(){
        System.out.println("this is public text()");
    }
    protected void test2(){
        System.out.println("this is protected text()");
    }
    void test3(){
        System.out.println("this is package-level text()");
    }
    private void test4(){
        System.out.println("this is private text()");
    }
}

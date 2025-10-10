package com.jspiders.staticblocks;
class Demo{
    static int a=5;
    static {
        System.out.println("1st static block");
    }
    public static void m1(){
        System.out.println("m1() called");
    }
    static {
        System.out.println("2nd static block");
    }
}
public class MainClass {
    static void main() {
        System.out.println(Demo.a);
    }
}

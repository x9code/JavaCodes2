package com.jspiders.staticblocks;

class Class1{
    static int h = 6;
    static {
        System.out.println("static block 1 executed");
    }
    static int f;
    static{
        f=100;
        System.out.println("static block 2 executed");
    }
    float k =7.6f;
    {
        System.out.println("non-static block 1 executed");
    }
    double r;
    {
        r = 5.4;
        System.out.println("non-static block 2 executed");
    }
}
public class AllinOne {
    static void main() {
        System.out.println(Class1.h);
        System.out.println(Class1.f);
        Class1 c1 = new Class1();
        System.out.println(c1.k);
        System.out.println(c1.r);
    }
}

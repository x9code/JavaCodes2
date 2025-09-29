package com.jspiders.packages.p1;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("program starts....");
        Demo d1 = new Demo();
        System.out.println("d1.v1 : "+d1.v1);
        d1.test1();
        System.out.println("d1.v2 : "+d1.v2);
        d1.test2();
        System.out.println("d1.v3 : "+d1.v3);
        d1.test3();
        //System.out.println("d1.v4 : "+d1.v4);//private
        //d1.test4();
        System.out.println("program ends......");
    }
}

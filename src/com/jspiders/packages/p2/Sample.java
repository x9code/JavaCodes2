package com.jspiders.packages.p2;
import com.jspiders.packages.p1.Demo;
public class Sample extends Demo {
    public static void main(String[] args) {
        System.out.println("program starts....");
        Sample d1 = new Sample();//sub class object
        Demo d2 = new Demo();//super class object
        System.out.println("d1.v1 : "+d1.v1);
        d1.test1();
        System.out.println("d2.v1 : "+d2.v1);
        d2.test1();
        System.out.println("d1.v2 : "+d1.v2);
        d1.test2();
        //System.out.println("d1.v3 : "+d1.v3);//package level
        //d1.test3();
        //System.out.println("d1.v4 : "+d1.v4);//Private
        //d1.test4();

        System.out.println("Program ends......");
    }

}

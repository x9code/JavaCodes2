package com.jspiders.java8.interfaceEnhancement;
interface Run1{
    public default void test(){
        System.out.println("this is test() of run1");
    }
}
interface Run2{
    public default void test(){
        System.out.println("this is test() of run2");
    }
}
class Demo1 implements Run1, Run2{
    @Override
    public void test(){
        //System.out.println("test() override in demo1");
        Run1.super.test();
        Run2.super.test();
    }
}
public class MainClass2 {
    public static void main(String[] args) {
        Demo1 d2 = new Demo1();
        d2.test();
    }
}

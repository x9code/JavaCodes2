package com.jspiders.oops.interface_in_java;

interface Run{
    int x = 100;//final and static
    public void test();//abstract
}
interface Sample extends Run{
    public void count();//new abstract method in the extened interface
}
class Demo implements Sample{
    @Override
    public void test(){
        System.out.println("override test() of Run interface ");
    }
    @Override
    public void count(){
        System.out.println("Override count() of Sample InterFce");
    }
}
class Interface1{
    public static void main(String[] args) {
        System.out.println("starts......");
        System.out.println(Run.x);
        Demo d = new Demo();
        d.test();
        d.count();
        System.out.println(d.x);
        System.out.println("ends........");
    }
}

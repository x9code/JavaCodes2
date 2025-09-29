package com.jspiders.java8.interfaceEnhancement;
interface Run{
    public void test();//abstract method
    public static void count(){//static & concrete methods can be written in interface after java8
        System.out.println("This is Static count() of Run interface");
    }
    public default void view(){//non-static(default) & concrete methods can be written in interface after java8
        System.out.println("This is default view() of run interface");
    }
}
class Demo implements Run{
    @Override
    public void test() {
        System.out.println("Overriding test() in Demo");
    }

}
class  Sample implements Run{
    @Override
    public void test() {
        System.out.println("overriding test() in sample");
    }
}
public class MainClass {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.view();
        Run.count();
        Sample s1= new Sample();
        s1.test();
        d1.test();
    }
}

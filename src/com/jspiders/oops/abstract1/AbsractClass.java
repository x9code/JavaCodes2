package com.jspiders.oops.abstract1;

abstract class Demo{
    static int z1 = 23;
    double f1 = 45.7;
    abstract public void test();
    public void view(){
        System.out.println("view() of demo class");
    }
    public static void count(){
        System.out.println("count() of demo class");
    }
}
class Sample extends Demo{
    @Override
    public void test(){
        System.out.println("test() of demo class inside sample class");
    }
}
class AbstClass{
    public static void main(String[] args) {
        //Demo d1 = new Demo();//cannot create object of abstract class
        System.out.println(Demo.z1);//accessing static data members
        Demo.count();//accessing static function members
        Sample s1 = new Sample();
        s1.test();//accessing non-static members by creating object of demo class's sub class
        System.out.println(s1.f1);//accessing non-static members by creating object of demo class's sub class
        s1.view();//accessing non-static members by creating object of demo class's sub class
    }
}

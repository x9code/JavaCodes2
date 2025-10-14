package com.jspiders.oops.relations_in_java;

class Demo{
    int z1 = 100;
    Sample ref1 = new Sample();
    public void test(){
        System.out.println("test()");
    }
}
class Sample{
    double a1 = 53.5;
    public void view(){
        System.out.println("view()");
    }
}
class Relations{
    public static void main(String[] args) {
        Demo d1 = new Demo();
        System.out.println(d1.z1);
        System.out.println(d1.ref1.a1);
        d1.ref1.view();
    }
}
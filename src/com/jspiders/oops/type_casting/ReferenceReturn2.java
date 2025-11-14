package com.jspiders.oops.type_casting;

class Demo4{
    public void test(){
        System.out.println("hello Demo class ");
    }
}
class Sample4 extends Demo4{
    public Demo4 getObject(){
        return new Sample4();
    }
    // public Sample getObject1(){
    // 	return new Sample();
    // }
}
class ReferenceReturn2{
    public static void main(String[] args) {
        Sample4 s1 = new Sample4();
        // s1.test();
        // Sample s2 = s1.getObject1();
        // s2.test();
        Demo4 d1 = s1.getObject();
        d1.test();
    }
}

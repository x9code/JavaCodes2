package com.jspiders.oops.type_casting;

interface Demo5{
    public void test();
}
class Sample5 implements Demo5{
    public void test(){
        System.out.println("Override test() of demo interface in sample class");
    }

    public Demo5 getObject(){
        return new Sample5();
    }
    // public Sample getObject1(){
    // 	return new Sample();
    // }
}
class ReferenceReturn3{
    public static void main(String[] args) {
        Sample5 s1 = new Sample5();
        // s1.test();
        // Sample s2 = s1.getObject1();
        // s2.test();
        Demo5 d1 = s1.getObject();
        d1.test();
    }
}

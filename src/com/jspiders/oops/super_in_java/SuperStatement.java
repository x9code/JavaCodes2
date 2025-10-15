package com.jspiders.oops.super_in_java;

class Demo{
    public Demo(){
        System.out.println("constuctor of demo class(super)");
    }
    public Demo(int e){
        System.out.println("constuctor of demo class(super) & "+e);
    }
}
class Sample extends Demo{
    public Sample(){
        super(567);
        System.out.println("constuctor of sample class(sub)");
    }
}
class SuperStatement{
    public static void main(String[] args) {
        Demo d1 = new Demo();
        // Demo d2 = new Demo(13);
        Sample s1 = new Sample();
    }
}

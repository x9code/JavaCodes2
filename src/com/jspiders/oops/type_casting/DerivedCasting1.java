package com.jspiders.oops.type_casting;

class Demo{
    int a1 = 23;
    public void test(){
        System.out.println("this test() of demo class");
    }
}
class Sample extends Demo{
    double k1 = 45.6;
    public void count(){
        System.out.println("this is count() of sample class");
    }
}
class DerivedCasting1{
    public static void main(String[] args) {
        Sample s1 = new Sample();
        System.out.println("s1.a1 : "+s1.a1);
        s1.test();
        System.out.println("s1.d1 : "+s1.k1);
        s1.count();
        System.out.println();
        Demo ref1 = new Sample();//up-casing
        Demo ref2 = s1;//up-casting
        System.out.println("ref1.a1 :  "+ ref1.a1);
        ref1.test();
        System.out.println();
        Sample s2 = (Sample)ref1;//down-casting with casting statemnt
        Sample s3 = (Sample)ref2;//down-casting with casting stateent
        System.out.println("s2.a1 : "+s2.a1);
        System.out.println("s3.a1 : "+s3.k1);
        s2.count();
        s3.test();

    }
}

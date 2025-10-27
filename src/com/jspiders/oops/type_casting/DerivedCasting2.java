package com.jspiders.oops.type_casting;

class Demo1{
    int a1 = 23;
    public void test(){
        System.out.println("this test() of demo1 class");
    }
}
class Sample1 extends Demo1{
    double k1 = 45.6;
    public void count(){
        System.out.println("this is count() of sample1 class");
    }
}
class DerivedCasting2{
    public static void view(Demo1 d1){
        System.out.println("this is view() with demo(super class)");
        System.out.println("d1 : "+d1);
    }
    public static void view(Sample1 s){
        System.out.println("this is view() with sample(sub class)");
        System.out.println("d1 : "+s);
    }
    public static void main(String[] args) {
        //DerivedCasting2 f = new DerivedCasting2();
        //Demo ref1 = new Demo();
        //f.view(ref1);
        //view(ref1);
        //System.out.println("ref1 : " + ref1);
        Sample1 s1 = new Sample1();
        //f.view(s1);
        view(s1);
    }
}

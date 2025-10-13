package com.jspiders.oops.inheritance;

class Demo{
    int a1= 100;
    public void test(){
        System.out.println("test() of demo");
    }
}
class Sample extends Demo{
    double z1 = 34.5;
    public void count(){
        System.out.println("count() of sample class");
    }
}
class Run extends Sample{
    String s = "Java";
    public void view(){
        System.out.println("View() of run");
    }
}
class MultiLevel{
    public static void main(String[] args) {
        System.out.println("Program Starts.....");
        Demo d1 = new Demo();
        System.out.println("d1.a1 : "+d1.a1);
        d1.test();

        System.out.println();

        Sample  s1 = new Sample();
        System.out.println("s1.z1 : "+s1.z1);
        System.out.println("s1.a1 : "+s1.a1);
        s1.count();
        s1.test();

        System.out.println();

        Run r1 = new Run();
        System.out.println("r1.s : "+r1.s);
        System.out.println("r1.z1 : "+r1.z1);
        System.out.println("r1.a1 : "+r1.a1);
        r1.view();
        r1.count();
        r1.test();

        System.out.println("Program ends.....");
    }
}

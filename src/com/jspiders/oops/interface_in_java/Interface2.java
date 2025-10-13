package com.jspiders.oops.interface_in_java;

interface Run1{
    public void view();
}
interface Run2{
    public void count();
}
class Demo implements Run1, Run2{
    @Override
    public void view(){
        System.out.println("overriding view() of Run1");
    }
    @Override
    public void count(){
        System.out.println("overriding count() of Run2");
    }
}
class Interface2{
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.view();
        d1.count();
    }
}

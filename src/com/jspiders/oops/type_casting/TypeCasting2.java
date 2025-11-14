package com.jspiders.oops.type_casting;

class TypeCasting2{
    public static void test(int a){
        System.out.println("this is test(int a)");
        System.out.println("a : "+a);
    }
    public static void test(short a){
        System.out.println("this is test(short a");
        System.out.println("a : "+a);
    }
    public static void main(String[] args) {
        char v1 = 'w';
        test(v1);
        byte v2 = 40;
        test(v2);
    }
}

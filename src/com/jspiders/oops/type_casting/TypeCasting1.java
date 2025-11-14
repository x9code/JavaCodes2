package com.jspiders.oops.type_casting;

class TypeCasting1{
    public static void main(String[] args) {
        byte b1 = 50;
        int i1;
        i1 = b1;//widening
        System.out.println("i1 : "+i1 +"  b1 : "+b1);
        int i2 = 70;
        byte b2;
        b2 = (byte)i2;//narrowing with casting statement
        System.out.println("i2 : "+i2 +"  b2 : "+b2);
    }
}

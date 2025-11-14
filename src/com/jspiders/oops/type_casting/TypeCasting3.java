package com.jspiders.oops.type_casting;

class TypeCasting3{
    public static void main(String[] args) {
        char c1 = 'A';
        int n1 = c1;
        System.out.println("n1 : "+n1);
        Short s1 = (short)c1;
        System.out.println("s1 : "+s1);
        byte b1 = (byte)c1;
        System.out.println("b1 : "+b1);
    }
}

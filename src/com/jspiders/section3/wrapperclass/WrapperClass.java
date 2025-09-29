package com.jspiders.section3.wrapperclass;

public class WrapperClass {
    public static void main(String[] args) {
        int i = 34;
        Integer l1 = i;//boxing
        double d = 4.5;
        Double d1 = d;//boxing

        int e = l1.intValue();//unboxing
        double d2 = d1.doubleValue();//unboxing

        Integer l = 56;
        Integer l4 = Integer.valueOf(67);
        System.out.println(l +" : "+l4);
    }
}

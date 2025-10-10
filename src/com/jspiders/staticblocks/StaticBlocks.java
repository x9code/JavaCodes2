package com.jspiders.staticblocks;

public class StaticBlocks {
    static int number;
    static {
        number = 100;
        System.out.println("static block got executed");
    }
    static void main() {
        System.out.println(number);
    }
}

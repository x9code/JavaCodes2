package com.jspiders.staticblocks;

public class NonStaticBlocks {
    int num ;
    {
        num = 100;
        System.out.println("non-static block got executed");
    }
    NonStaticBlocks(){
        System.out.println("constructor is called");
    }

    static void main() {
        NonStaticBlocks nsb = new NonStaticBlocks();
        System.out.println(nsb.num);
    }
}

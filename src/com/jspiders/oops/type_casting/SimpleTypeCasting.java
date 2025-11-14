package com.jspiders.oops.type_casting;

class Demo6 {
    static int count;

    static{
        count = 100;
        System.out.println("Static block executed"+count);
    }

    Demo6() {
        System.out.println("Constructor executed");
    }
}

public class SimpleTypeCasting {
    public static void main(String[] args) {
        System.out.println("Main method started");

        // Class Demo is loaded here
        Demo6 obj1 = new Demo6();
        //Demo obj2 = new Demo();
    }
}


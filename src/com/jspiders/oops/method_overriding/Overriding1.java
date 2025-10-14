package com.jspiders.oops.method_overriding;

class Parent {
    static void show() {
        System.out.println("Parent static show");
    }
}

class Child extends Parent {
    static void show() {
        System.out.println("Child static show");
    }
}

public class Overriding1 {
    public static void main(String[] args) {
        Parent p = new Child();
        p.show();  // Output: Parent static show
    }
}


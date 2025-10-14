package com.jspiders.oops.method_overloading;

interface Vehicle {
    public int a = 5;
    void start(); // abstract method

    // default void honk() {   // default method
    //     System.out.println("Beep beep!");
    // }
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car starts with key");
    }
}

public class Overloading {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();  // Car starts with key
        //car.honk();   // Beep beep!
        System.out.println(car.a);
        System.out.println(Vehicle.a);
    }
}


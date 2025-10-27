package com.jspiders.oops.type_casting;

interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Woof!");
    }

    public void fetch() {
        System.out.println("Fetching stick...");
    }
}

public class DerivedCasting4 {
    public static void main(String[] args) {
        // Upcasting (Child → Interface)
        Animal a = new Dog();  // implicit
        a.sound();

        // Downcasting (Interface → Child)
        Dog d = (Dog) a;  // explicit
        d.fetch();
    }
}


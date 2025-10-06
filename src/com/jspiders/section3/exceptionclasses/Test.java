package com.jspiders.section3.exceptionclasses;
class IllegalAge extends Exception{
    IllegalAge(String message){
        super(message);
    }
}
public class Test {
    static void checkAge(int age) throws IllegalAge{
        if(age < 18){
            System.out.println("Age must be greater than 18");
        }else{
            System.out.println("eligible for vote");
        }
    }

    static void main() {
        int age = 12;
        try{
            checkAge(age);
        } catch (IllegalAge e) {
            throw new RuntimeException(e);
        }
    }

}

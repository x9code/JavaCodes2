package com.jspiders.section3.exceptionclasses;

import java.util.Scanner;

class IllegalAge extends Exception{
//    IllegalAge(String message){
//        super(message);
//    }
}
public class UserDefinedException {
    static void checkAge(int age) throws IllegalAge{
        if(age < 18){
            System.out.println("Age must be greater than 18");
        }else{
            System.out.println("eligible for vote");
        }
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = sc.nextInt();
        try{
            checkAge(age);
        } catch (IllegalAge e) {
            //e.getMessage();
        }
    }

}

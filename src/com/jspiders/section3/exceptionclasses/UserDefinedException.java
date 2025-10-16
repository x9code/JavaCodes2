package com.jspiders.section3.exceptionclasses;

import java.util.Scanner;

class IllegalAge extends Exception{
    IllegalAge(String message){
        super(message);
    }
}
public class UserDefinedException {
    static void checkAge(int age) throws IllegalAge{
        if(age < 18){
           throw new IllegalAge("Age must be greater than 18");
        }else{
            System.out.println("eligible for vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        try{
            checkAge(age);
        } catch (IllegalAge e) {
            System.out.println(e.getMessage());
        }
    }

}

package com.jspiders.section3.exceptionclasses;

import java.util.Scanner;

class InsufficientBalance extends Exception{
    InsufficientBalance(String s){
        super(s);
    }
}
public class BankAccount {
    public static void withdrawAmount(double amount, double balance) throws InsufficientBalance{
        if(amount > balance){
            throw new InsufficientBalance("Withdrawal Failed : Insufficient balance");
        }else{
            balance -= amount;
            System.out.println("Withdrawal successful remaining balance :"+balance);
        }
    }

    static void main() {
      double balance = 3000;
        System.out.println("Enter the amount :");
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        try{
            withdrawAmount(amount,balance);
        } catch (InsufficientBalance e) {
            System.out.println(e.getMessage());
        }
    }
}

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

    public static void main(String[] args) {
      double balance = 3000;
        System.out.println("Enter the amount :");
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        try{
            withdrawAmount(amount,balance);
        } catch (InsufficientBalance e) {
            System.out.println(e.getMessage());
        }
        /*withdrawAmount(amount, balance); - this can be also written without try-catch block with throws keyword.
          By writing in this way the  exception will propagate to default exception handler by the JVM.
          And the JVM will print :-
                        1. Name of the exception(i.e.InsufficientBalance)
                        2. Reason for the exception
                        3. full stack trace of all the methods involved
         */
    }
}

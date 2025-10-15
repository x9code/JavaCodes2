package com.jspiders.oops.speacialization;

class Account{
    double roi;
    double charges;
    public Account(double roi, double charges){
        this.roi = roi;
        this.charges = charges;
    }
    public void showAccountDetails(){
        System.out.println("roi : "+roi);
        System.out.println("charges : "+charges);
    }
}
class Savings extends Account{
    double balance;
    public Savings(double balance){
        super(1.4,3444.3);
        this.balance = balance;
        System.out.println("Savings_const is activated");
    }
    public void withdraw(double amount){
        balance = balance-amount;
    }
    public void deposit(double amount){
        balance = balance + amount;
    }
    public void checkBalance(){
        System.out.println("account balance is : "+balance);
    }
}
class Loan extends Account{
    double loanAmount;
    String loanType;
    public Loan(double loanAmount, String loanType){
        super(2.3,3400);
        this.loanAmount = loanAmount;
        this.loanType = loanType;
        System.out.println("Loan_const is activated");
    }
    public void deposit(double amount){
        loanAmount = loanAmount-amount;
    }
    public void showLoanDetails(){
        System.out.println("loan amount is : "+ loanAmount+" On "+loanType);
    }
}
class SpecAndGen{
    public static void main(String[] args) {
        System.out.println("starts.......");
        Savings sv1 = new Savings(34522);
        sv1.showAccountDetails();
        sv1.withdraw(12);
        sv1.deposit(30000);
        sv1.checkBalance();
        System.out.println();
        Loan l1 = new Loan(21000, "Homeloan");
        l1.showAccountDetails();
        l1.showLoanDetails();
        l1.deposit(300);
        l1.showLoanDetails();
        System.out.println("ends..........");
    }
}

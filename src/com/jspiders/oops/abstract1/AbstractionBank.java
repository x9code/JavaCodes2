package com.jspiders.oops.abstract1;

abstract class Account{
    abstract public void createAccount();
    abstract public void closeAccount();
}
class Saving extends Account{
    @Override
    public void createAccount(){
        System.out.println("Saving Account is created");
    }
    @Override
    public void closeAccount(){
        System.out.println("Saving Account is closed");
    }
}
class Loan extends Account{
    @Override
    public void createAccount(){
        System.out.println("Loan Account is Created");
    }
    @Override
    public void closeAccount(){
        System.out.println("Loan Account is closed");
    }
}
class AbstClassBank{
    public static void main(String[] args) {
        Saving s1 = new Saving();
        Loan l1 = new Loan();
        s1.createAccount();
        s1.closeAccount();
        l1.createAccount();
        l1.closeAccount();
    }
}

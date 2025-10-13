package com.jspiders.oops.encapsulation;

class Account1{
    private double balance;
    public void setBalance(double balance){
        if(balance>0){
            this.balance=balance;
            //System.out.println(balance);
        }else{
            System.out.println("Your account is negative value");
        }

    }
    public double getBalance(){
        return this.balance;
    }


}
class Account{
    public static void main(String[] args) {

        Account1 a1=new Account1();
        a1.setBalance(2000);
        //a1.setBalance(-3000);
        System.out.println( a1.getBalance());
    }
}

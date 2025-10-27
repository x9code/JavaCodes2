package com.jspiders.oops.type_casting;

class CardPayment{
    public void getCardDatails(){
        System.out.println("Getting Card details");
    }
    public void verifyCVV(){
        System.out.println("Verify CVV");
    }
}
class UPI{
    public void verifyUpiId(){
        System.out.println("Verifying Upi id");
    }
    public void verifyPIN(){
        System.out.println("Verifying UPI PIN");
    }
}
class PaymentService{
    public void makePayment(Object payment){
        if(payment instanceof CardPayment){
            CardPayment cp = (CardPayment) payment;//down casting
            cp.getCardDatails();
            cp.verifyCVV();
            System.out.println("payment done by card");
        }
        else if(payment instanceof UPI){
            UPI u = (UPI) payment;//Down casting
            u.verifyUpiId();
            u.verifyPIN();
            System.out.println("payment done by UPI");
        }
    }
}
class DerivedCasting3{
    public static void main(String[] args) {
        System.out.println("starts.......");
// ClassCastException - (JVM will throw this exception at runtime) / when we downcast to other sub class
        PaymentService ps = new PaymentService();
        CardPayment cp1 = new CardPayment();
        UPI u1 = new UPI();
        ps.makePayment(cp1);
        System.out.println();
        ps.makePayment(u1);
        System.out.println("ends.........");
    }
}

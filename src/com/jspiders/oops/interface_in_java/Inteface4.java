package com.jspiders.oops.interface_in_java;

abstract class GmailUser{
    public void signup(){
        System.out.println("User Creating Account");
    }
    abstract public void allocateStorage();
}
interface filterFeature{
    public void SpamFilter();
}
interface Priority{
    public void showInbox();
}
class FreeUser extends GmailUser implements filterFeature{
    @Override
    public void SpamFilter(){
        System.out.println("free user gets spam filter feature");
    }
    @Override
    public void allocateStorage(){
        System.out.println("5 GB storage is allocatted");
    }
}
class PaidUser extends GmailUser implements filterFeature, Priority{
    @Override
    public void SpamFilter(){
        System.out.println("Paid user gets spam filter feature");
    }
    @Override
    public void allocateStorage(){
        System.out.println("10 GB storage is allocatted");
    }
    @Override
    public void showInbox(){
        System.out.println("Paid user gets Priority inbox");
    }
}
class Interface4{
    public static void main(String[] args) {
        FreeUser f1 = new FreeUser();
        f1.signup();
        f1.SpamFilter();
        f1.allocateStorage();
        System.out.println();
        PaidUser p1 = new PaidUser();
        p1.signup();
        p1.SpamFilter();
        p1.allocateStorage();
        p1.showInbox();
    }
}

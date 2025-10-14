package com.jspiders.oops.interface_in_java;

abstract class User{
    public void login(){
        System.out.println("User trying to login");
    }
    //abstract public void signup();
}
interface Postable{
    public void postStories();
    public void postPhotos();
    public void postVideos();
    public void signup();
}
class NormalUser extends User implements Postable{
    @Override
    public void signup(){
        System.out.println("Normal User Creating Account");
    }
    @Override
    public void postStories(){
        System.out.println("Normal User posting Stories");
    }
    @Override
    public void postPhotos(){
        System.out.println("Normal user posting Photos ");
    }
    @Override
    public void postVideos(){
        System.out.println("Normal User posting Videos");
    }
}
class BusinessUser extends User implements Postable{
    @Override
    public void signup(){
        System.out.println("Business User Creating Account");
    }
    @Override
    public void postStories(){
        System.out.println("Business User posting Stories");
    }
    @Override
    public void postPhotos(){
        System.out.println("Business user posting Photos ");
    }
    @Override
    public void postVideos(){
        System.out.println("Business User posting Videos");
    }
}
class Interface3{
    public static void main(String[] args) {
        System.out.println("Starts ............");
        NormalUser n1 = new NormalUser();
        n1.login();
        n1.signup();
        n1.postStories();
        n1.postPhotos();
        n1.postVideos();
        System.out.println();
        System.out.println();
        BusinessUser b1 = new BusinessUser();
        b1.login();
        b1.signup();
        b1.postStories();
        b1.postPhotos();
        b1.postVideos();
        System.out.println("Ends ..............");
    }
}

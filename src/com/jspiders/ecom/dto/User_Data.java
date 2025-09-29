package com.jspiders.ecom.dto;

import java.util.Scanner;

class User {
    private int UID;
    private String username;

    public int getUID() {
        return UID;
    }

    public void setUID(int UID) {
        this.UID = UID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
class UserService{
    private User[] users = new User[4];
    private int currentIndex = 0;

    public void addUser(User user){
        if(currentIndex<=users.length-1){
            users[currentIndex] = user;
            currentIndex++;
            System.out.println("User added");
        }
        else
        {
            System.out.println("Array is full cannot add any other user");
        }
    }
}
public class User_Data{
    public static void main(String[] args) {
        UserService ps = new UserService();
        User p1 = new User();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user name :");
        p1.setUsername(sc.next());
        System.out.println("Enter Product ID :");
        p1.setUID(sc.nextInt());
    }
}
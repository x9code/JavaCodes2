package com.jspiders.section3.string;

import java.util.Scanner;
class DigitReturn{
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int v = s.charAt(0)-'0';
        System.out.println("First digit is :"+v);
    }
}
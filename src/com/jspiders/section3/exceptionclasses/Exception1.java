package com.jspiders.section3.exceptionclasses;
import java.util.Scanner;
public class Exception1 {
    public static void test(int a, int b){
        int[] arr = {20,30,40,50,60,70};
        try{
            int res = a / b;
            System.out.println("Result is  : "+res);
            System.out.println("array element at index"+res+" : "+arr[res]);
        }catch (ArithmeticException ae){
            System.out.println("Arithmetic Exception occurred");
            ae.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("ArrayIndexOutOfBoundsException occurred.");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter Number 1 : ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Enter Number 2 : ");
        Scanner sc1 = new Scanner(System.in);
        int num2 = sc1.nextInt();
        test(num1,num2);

    }
}

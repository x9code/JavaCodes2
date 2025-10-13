package com.jspiders.array;

public class CharArray {
    public static char test(char[] num, int i){
        int len = num.length - 1;
        try {
            if(i <= len){
                System.out.println(num[i]);
            }
            return num[i];
        } catch(Exception e) {
            System.out.println("invalid input");
            return '?';  // return a default char
        }
    }

    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'd'};
        test(arr, 3);  // Output: d
    }
}


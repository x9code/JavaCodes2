package com.jspiders.pattern;

public class Pattern11 {
    public static void main(String[] args){
        int n = 5;
        for (int r = 1; r <= n; r++) {
            for (int s = 1; s <= n - r; s++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= r; c++) {
                System.out.print(c);
            }
            System.out.println();
        }


    }
}
//            1
//            12
//            123
//            1234
//            12345
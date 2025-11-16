package com.jspiders.pattern;

public class Pattern9 {
    public static void main(String[] args){
        int n = 5;
        for (int r = n; r >= 1; r--) {
            for (int s = 1; s <= n - r; s++) {
                System.out.print(" ");
            }
            for (char c = 'A'; c < 'A' + r; c++) {
                System.out.print(c);
            }
            for (char c = (char) ('A' + r - 2); c >= 'A'; c--) {
                System.out.print(c);
            }
            System.out.println();
        }



    }
}

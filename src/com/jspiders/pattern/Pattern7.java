package com.jspiders.pattern;

public class Pattern7 {
    public static void main(String[] args){
        int n = 5;
        for (int r = 1; r <= n; r++) {
            for (int s = 1; s <= n - r; s++) {
                System.out.print(" ");
            }
            for (char c = 'A'; c < 'A' + r; c++) {
                System.out.print(c);
            }
            System.out.println();
        }

    }
}

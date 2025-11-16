package com.jspiders.pattern;

public class Pattern5 {
    public static void main(String[] args) {
        int n = 5;
        for (int r = 1; r <= n; r++) {
            char ch = (char) ('A' + r - 1);
            for (int c = 1; c <= r; c++) {
                System.out.print(ch);
            }
            System.out.println();
        }

    }
}

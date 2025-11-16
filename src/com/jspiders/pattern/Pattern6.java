package com.jspiders.pattern;

public class Pattern6 {
    public static void main(String[] args){
        int n = 5;
        for (int r = n; r >= 1; r--) {
            for (char c = 'A'; c < 'A' + r; c++) {
                System.out.print(c);
            }
            System.out.println();
        }

    }
}

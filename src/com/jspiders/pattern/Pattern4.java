package com.jspiders.pattern;

class Pattern4 {
    public static void main(String[] args) {
        int n = 3;
        for (int row = 1; row <= n; row++) {
            for (char col = 'A'; col <'A'+row; col++) {

                System.out.print(col);
            }
            System.out.println();
        }
    }
}



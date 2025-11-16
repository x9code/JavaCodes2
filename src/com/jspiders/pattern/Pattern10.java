package com.jspiders.pattern;

public class Pattern10 {
    public static void main(String[] args){
        int n = 5;
        int num = 1;
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= r; c++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15


    }
}

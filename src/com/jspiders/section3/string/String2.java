package com.jspiders.section3.string;

import java.util.Arrays;
class NewString{
    public static void main(String[] args) {
        String s = "WelCoMe";
        int l = s.length();
        char[] c = s.toCharArray();
        char[] upper = new char[20];
        char[] lower = new char[20];
        int uIndex = 0, lIndex = 0;
        for (char n : c) {
            if (n >= 'A' && n <= 'Z') {
                upper[uIndex++] = n;  // store uppercase letter
            } else if (n >= 'a' && n <= 'z') {
                lower[lIndex++] = n;  // store lowercase letter
            }
        }
        System.out.println("Upper cases: " + Arrays.toString(Arrays.copyOf(upper, uIndex)));
        System.out.println("Lower cases: " + Arrays.toString(Arrays.copyOf(lower, lIndex)));
    }
}

package com.jspiders.section3.string;

class Program{
    public static void main(String[] args) {
        String str1 = "java";
        String str2 = "java";
        String str3 = "JAVA";
        int len = str1.length();
        System.out.println("length of string: "+len);
        char[] c1 = str1.toCharArray();
        System.out.println(c1);
        boolean res = str1.equals(str2);
        System.out.println(res);
        boolean res1 = str1.equals(str3);
        System.out.println(res1);
        boolean res2 = str1.equalsIgnoreCase(str3);
        System.out.println(res2);
        char ch = str1.charAt(1);
        System.out.println(ch);
    }
}

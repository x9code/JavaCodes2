package com.jspiders.section3.string;

class Program2{
    public static boolean test(String str){
        char one = str.charAt(0);
        char two = str.charAt(1);
        int midIndex = (str.length()-1)/2;
        char mid = str.charAt(midIndex);
        int lastIndex = str.length()-1;
        char last = str.charAt(lastIndex);
        if((one == mid && one==last) && (two == mid && two == last)){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        String s1 = "aaaja";
        boolean res = test(s1);
        System.out.println(res);

    }
}

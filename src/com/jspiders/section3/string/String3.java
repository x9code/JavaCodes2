package com.jspiders.section3.string;

class NewString1{
    public static void main(String[] args) {
        String s = "WelcomeMe";
        String upper = "";
        String lower = "";
        for(char ch : s.toCharArray()){
            if(Character.isUpperCase(ch)){
                upper+=ch;
            }else if(Character.isLowerCase(ch)){
                lower+=ch;
            }
        }
        System.out.println("Upper case : "+upper);
        System.out.println("lower case : "+lower);
    }
}

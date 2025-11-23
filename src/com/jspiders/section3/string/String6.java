package com.jspiders.section3.string;

class Program3{
    public static boolean test(String str){
        boolean result = false;
        char one = str.charAt(0);
        char two = str.charAt(1);
        char th3 = str.charAt(2);
        int lastIndex = str.length()-1;
        int twoLastIndex = str.length()-2;
        int thirdLastIndex = str.length()-3;
        char last = str.charAt(lastIndex);
        char twolast = str.charAt(twoLastIndex);
        char thirdLast = str.charAt(thirdLastIndex);
        if(('c'==one &&'a'==two &&'t'==th3)|| ('c'==thirdLast&& 'a'==twolast&& 't'==thirdLast)){
            result =  true;
        }
        return result;
    }
    public static void main(String[] args) {
        String s = "cntmanar";
        boolean res = test(s);
        System.out.println(res);
    }
}

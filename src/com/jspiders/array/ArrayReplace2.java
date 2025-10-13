package com.jspiders.array;

public class ArrayReplace2{
    public static void test(int[] num){
        int last = num.length-1;
        int mul = num[(num.length-1)/2]*num[last-1];
        num[0]=mul;
        num[1]=mul;
        for(int i=0;i<=last;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] a = {2,4,6,8,12};
        test(a);
    }
}
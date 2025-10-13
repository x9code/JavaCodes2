package com.jspiders.array;

public class ArraySwap{
    public static void test(int[] num){
        int last = num.length-1;
        if(num[0]%2==0 && num[last]%2==0){
            int temp = num[0];
            num[0] = num[last];
            num[last]=temp;
        }
        for(int i = 0;i<=last;i++){
            System.out.print(num[i]+"  ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] a = {2,4,5,6,7,8};
        test(a);
    }
}

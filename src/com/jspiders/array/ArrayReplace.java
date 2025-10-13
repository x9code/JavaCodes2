package com.jspiders.array;

public class ArrayReplace{
    public static void test(int[] num){
        int last = num.length-1;
        if(num[1]%2!=0){
            num[1]=-1;
        }
        if(num[last-1]%2!=0){
            num[last-1]=-1;
        }
        for(int i = 0;i<=last;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] a={1,3,5,7,8};
        test(a);

    }
}

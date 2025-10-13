package com.jspiders.array;

public class Array1{
    public static void test(int[] nums){
        int last = nums.length-1;

        // int a=nums[last];
        // int b=nums[0];
        // nums[0]=a;
        // nums[last]=b;
        int temp=nums[0];
        nums[0]=nums[last];
        nums[last]=temp;
        for(int i=0;i<=last;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("starts.....");
        int[] a1={10,20,30,40};
        test(a1);
    }
}

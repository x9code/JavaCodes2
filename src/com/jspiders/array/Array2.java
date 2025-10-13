package com.jspiders.array;

public class Array2 {
    public static void test(int[] nums) {
        int last = nums.length - 1;

        if (nums[0] % 3 == 0) {
            nums[0] = 3;
        }
        if ((nums[0] + nums[last]) % 4 == 0) {
            nums[(nums.length - 1) / 2] = 0;
        }
        for(int i=0;i<=last;i++){
            System.out.print(nums[i]+"  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a1 = {9, 20, 30, 3, 13};
        test(a1);
    }
}


package com.jspiders.array;

public class SearchArray{
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50,20};
        int x = 20;
        boolean result = false;
        for(int i =0;i<=a.length-1;i++){
            if(x==a[i]){
                result = true;
                System.out.println("element found at :"+i);
            }
        }
        if(result)
            System.out.println("FOUND");
    }
}

package com.jspiders.pattern;

class Pattern3{
    public static void main(String[] args) {
        int n = 10;
        for(int row =1;row<=n;row++){
            for(int col=1;col<=n;col++){
                if(  row == col || col ==1 || row == 10 ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


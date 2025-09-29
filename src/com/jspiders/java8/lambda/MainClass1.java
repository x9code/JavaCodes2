package com.jspiders.java8.lambda;
@FunctionalInterface
interface Run{
    public void test(int num);
}
public class MainClass1 {
    public static void main(String[] args) {
        Run ref1 = (int num) -> {
            for(int i = 1;i<=num;i++){
                System.out.println(i);
            }
        };
        Run ref2 = (int num) ->{
            for (int i = num; i>=1; i--){
                System.out.println(i);
            }
        };
        ref1.test(5);
        System.out.println();
        ref2.test(5);
    }
}

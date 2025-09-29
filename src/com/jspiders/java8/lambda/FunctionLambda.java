package com.jspiders.java8.lambda;
import java.util.function.Function;
public class FunctionLambda {
    public static void main(String[] args) {
        Function<Integer,Integer> f1 = (Integer num) ->{
            return num/3;
        };

        int a,b,c;

        a=10;b=20;c=30;
        int sum = a+b+c;
        int avg  = f1.apply(sum);
        System.out.println("average is :"+avg);
        System.out.println();
    }
}
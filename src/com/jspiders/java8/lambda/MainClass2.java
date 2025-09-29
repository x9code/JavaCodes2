package com.jspiders.java8.lambda;
import java.sql.SQLOutput;
import java.util.function.Predicate;
public class MainClass2 {
    public static void main(String[] args) {
        Predicate<Integer> p1 = (Integer num) -> {
            System.out.println("input is : "+num);
            return num%2==0;
        };
        boolean res = p1.test(5);
        boolean res1 = p1.test(4);
        System.out.println("Res : "+res+"   Res1 : "+res1);
        Predicate<Double> p2 = (Double d)->{
            System.out.println("input is :"+d);
            return d%2==0;
        };
        boolean res2 = p1.test(15);
        boolean res3 = p1.test(24);
        System.out.println("Res2 : "+res2+"   Res3 : "+res3);
    }
}

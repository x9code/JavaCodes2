package com.jspiders.java8.lambda;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class FunctionalInterfaceTypes {
    public static void main(String[] args) {
        Consumer<String> c1 = (String str) ->{
            System.out.println(str);
        };
        Supplier<String> s1 = () ->{
            return "Hello2";
        };
        BiFunction<Integer,Integer,Integer> b1 = (Integer n1, Integer n2) ->{
            int i = n1 + n2;
            return i;
        };
        c1.accept("hello1");
        System.out.println( s1.get());
        System.out.println( b1.apply(2,3));
    }
}

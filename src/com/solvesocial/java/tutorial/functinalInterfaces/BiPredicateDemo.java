package com.solvesocial.java.tutorial.functinalInterfaces;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
//    @Override
//    public boolean test(String s, String s2) {
//        return s.equals(s2);
//    }


    public static void main(String[] args) {
//        BiPredicate<String , String> biPrdc = new BiPredicateDemo();
//        System.out.println(biPrdc.test("Hello", "World"));


        BiPredicate<String , String> biPrdc = (a,b)-> a.equals(b);
        System.out.println(biPrdc.test("Hello", "Hello"));

        BiPredicate<Integer , Integer> biPrdc1 = (a,b)-> a>b;
        BiPredicate<Integer , Integer> biPrdc2 = (a,b)-> a == b;

        System.out.println(biPrdc1.test(4, 5));
        System.out.println(biPrdc2.test(4, 5));
        System.out.println("*****");
        //or you can use both in one line as below
        System.out.println(biPrdc1.and(biPrdc2).test(6,6));
        System.out.println(biPrdc1.or(biPrdc2).test(6,6));

    }
}

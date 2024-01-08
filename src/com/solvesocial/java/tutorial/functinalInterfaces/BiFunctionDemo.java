package com.solvesocial.java.tutorial.functinalInterfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionDemo  implements BiFunction<Integer, Integer , Integer> {

    @Override
    public Integer apply(Integer t, Integer u) {
        return (t+u);
    }

    public static void main(String[] args) {
        BiFunction<Integer, Integer , Integer> biFn = new BiFunctionDemo();
        System.out.println(biFn.apply(10,20));

        //Using lambda instead of overriding
        BiFunction<Integer, Integer , Integer> biFn1 = (a, b) ->  (a+b);
        System.out.println(biFn1.apply(15,20));

        //Another ecample for mutkiplication
        BiFunction<Integer, Integer , Integer> biFn2 = (a, b) ->  (a*b);
        System.out.println(biFn2.apply(5,20));

        BiFunction<Integer, Integer , Integer> biFn3 = (a, b) ->  (a-b);
        System.out.println(biFn3.apply(55,20));

        //Bifucntion using another function
        Function<Integer, Integer> function = num -> (num*num);
        System.out.println(biFn1.andThen(function).apply(40, 20));

    }
}

package com.solvesocial.java.tutorial.functinalInterfaces;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerDemo implements BiConsumer<Integer, Integer> {

    @Override
    public void accept(Integer a, Integer b) {
        System.out.println(a+b);
    }

    public static void main(String[] args) {

        BiConsumer<Integer,Integer> biCosmr = new BiConsumerDemo();
        biCosmr.accept(10, 20);

        //using lambda expressions
        BiConsumer<Integer,Integer> biCosmr1 = (a,b) -> System.out.println(a+b);
        biCosmr1.accept(222,33);

        //Substtraction
        BiConsumer<Integer,Integer> biCosmr2 = (a,b) -> System.out.println(a*b);
        biCosmr2.accept(12,13);

        BiConsumer<Integer,Integer> biCosmr3 = (a,b) -> System.out.println(a-b);
        biCosmr3.accept(44,13);

        Map<Integer, String> map = new LinkedHashMap();
        map.put(1, "Java");
        map.put(2, "C langauage");
        map.put(3, "LISP");

        map.forEach((k,v)-> {
            System.out.println(k);
            System.out.println(v);

        });


    }
}

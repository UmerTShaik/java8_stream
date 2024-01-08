package com.solvesocial.java.tutorial;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamCountMinMaxExample {
    public static void main(String[] args) {
        //count() , min(), max() methods

        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7);
        System.out.println(stream.count());

        Stream<Integer> stream1 = Stream.of(1,2,3,4,5,6,7);
        Integer integerVal = stream1.min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Min value is" +integerVal);

        Stream<Integer> stream2 = Stream.of(1,2,3,4,5,6,7);
        Integer max = stream2.max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Max value is" +max);
    }
}

package com.solvesocial.java.tutorial;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class FindElementsinStreamExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,8,4,6,5);

        //findIFrst() and findAny()
        Optional<Integer> element = list.stream().findFirst();
        if(element.isPresent()){
            System.out.println(element.get());
        } else{
            System.out.println("stream is empty");
        }

        Optional<Integer> ele1 = list.stream().findAny();
        if(ele1.isPresent()){
            System.out.println(ele1.get());
        } else{
            System.out.println("stream is empty");
        }

    }
}

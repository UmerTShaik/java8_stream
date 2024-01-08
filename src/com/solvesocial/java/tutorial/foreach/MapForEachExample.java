package com.solvesocial.java.tutorial.foreach;

import java.util.HashMap;
import java.util.Map;

public class MapForEachExample {
    public static void main(String[] args) {
        Map<Integer , Person> map = new HashMap<Integer , Person>();
        map.put(1, new Person("Tony", 33));
        map.put(2, new Person("Ariel", 24));
        map.put(3, new Person("Tide", 44));

        //use of for each loop
        for(Map.Entry<Integer , Person> entry: map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        System.out.println("****");
        //use for each
        map.forEach((k,v)->{
            System.out.println(k);
            System.out.println(v);
        });

    }
}

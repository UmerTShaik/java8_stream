package com.solvesocial.java.tutorial.foreach;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetForEachExample {
    public static void main(String[] args) {
        Set<Person> set = new HashSet<Person>();
        set.add(new Person("Mark", 50));
        set.add(new Person("Ellllis", 22));
        set.add(new Person("Boney", 46));
        set.add(new Person("Rapsutin", 32));

        //Beofre java 8
        for(Person p : set){
            System.out.println(p.getName());
            System.out.println(p.getAge());
        }
        System.out.println("***");

        //foreach with lambda
        set.forEach(p1-> System.out.println(p1));
        System.out.println("***");

        //for each with stream
        set.stream().forEach(p2-> System.out.println(p2));
    }
}

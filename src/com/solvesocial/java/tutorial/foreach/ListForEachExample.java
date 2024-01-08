package com.solvesocial.java.tutorial.foreach;

import java.util.ArrayList;
import java.util.List;

public class ListForEachExample{
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();
        list.add(new Person("Mark", 50));
        list.add(new Person("Ellllis", 22));
        list.add(new Person("Boney", 46));
        list.add(new Person("Rapsutin", 32));

        //Beofre java 8
        for(Person p : list){
            System.out.println(p.getName());
            System.out.println(p.getAge());
        }
        System.out.println("***");
        //java 8 foreach method
        list.forEach((p1)->{
            System.out.println(p1.getAge());
            System.out.println(p1.getName());
        });
        System.out.println("***");

        //Using stream
        list.stream().forEach(System.out::println);

    }
}

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

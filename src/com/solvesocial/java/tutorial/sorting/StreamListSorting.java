package com.solvesocial.java.tutorial.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSorting {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");

        //Sort a list in Ascending order
        //Sorting the list using compaortor
        List<String> srtdList = fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        srtdList.forEach(System.out::println);
        System.out.println("*********************");

        //Sorting the list using compaortor with lambda exprs
        List<String> srtdList1  = fruits.stream().sorted((o1,o2) -> o1.compareTo(o2)).collect(Collectors.toList());
        srtdList1.forEach(System.out::println);
        System.out.println("*********************");

        //Sorting the list wihtput parameter
        List<String> srtdList2  = fruits.stream().sorted().collect(Collectors.toList());
        srtdList2.forEach(System.out::println);
        System.out.println("*********************");

        //Sort by Descending order
        //Sorting the list using compaortor
        List<String> srtdList3 = fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        srtdList3.forEach(System.out::println);
        System.out.println("*********************");

        //Sorting the list using compaortor with lambda exprs
        List<String> srtdList4  = fruits.stream().sorted((o1,o2) -> o2.compareTo(o1)).collect(Collectors.toList());
        srtdList4.forEach(System.out::println);
        System.out.println("*********************");

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(13, "Mark", 55000));
        employees.add(new Employee(12, "Anthoby", 44000));
        employees.add(new Employee(22, "Pablo", 56000));

        //sort objecy=ts using anynoymous compoartor implmentation
        //old way
        List<Employee> emplSrtLst = employees.stream().sorted(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getSalary() - o2.getSalary());
            }
        }).collect(Collectors.toList());

        emplSrtLst.forEach(System.out::println);
        System.out.println("*********************");

        //new way in java 8
        employees.stream().
                sorted((o1,o2)-> (int) (o1.getSalary() - o2.getSalary())).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("*********************");

        //using lambda expression compaortor
        List<Employee> collect = employees.stream().sorted(Comparator.comparingLong(Employee::getSalary)).collect(Collectors.toList());
        collect.forEach(System.out::println);
        System.out.println("*********************");

        //compoare in descending order
        List<Employee> emplSrtLst2 = employees.stream().sorted(Comparator.comparingLong(Employee::getSalary).reversed()).collect(Collectors.toList());
        emplSrtLst2.forEach(System.out::println);
        System.out.println("*********************");

        //using lambda expression compaortor coparelng method by age
        List<Employee> collect1 = employees.stream().sorted(Comparator.comparingLong(Employee::getId)).collect(Collectors.toList());
        collect1.forEach(System.out::println);
        System.out.println("*********************");

        //using lambda expression compaortor coparelng method by "age" bydescending
        List<Employee> collect2 = employees.stream().sorted(Comparator.comparingLong(Employee::getId).reversed()).collect(Collectors.toList());
        collect2.forEach(System.out::println);
        System.out.println("*********************");
    }
}

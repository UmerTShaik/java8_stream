package com.solvesocial.java.tutorial;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {
    public static void main(String[] args) {
        //before java 8 start*****
        List<Product> list = new ArrayList<Product>();

        for(Product prd: getProducts()){
            if(prd.getPrice() > 25000f){
                list.add(prd);
            }
        }

        for(Product prdt:list){
            System.out.println(prdt);
        }
        //before java 8 end******
        System.out.println("*********************");
        //Using Stream API
        getProducts().stream().
                filter((product)->product.getPrice()> 25000f).collect(Collectors.toList()).forEach(System.out::println);
       // list2.forEach(System.out::println);
    }

    private static List<Product> getProducts(){
        List<Product> productsList = new ArrayList<Product>();
        productsList.add(new Product(1, "HP laptop", 25000f));
        productsList.add(new Product(2,"Dell laptop", 34000f));
        productsList.add(new Product(2,"Hawaii", 48000f));
        return productsList;
    }
}


class Product {
    private int id;
    private String name;
    private float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

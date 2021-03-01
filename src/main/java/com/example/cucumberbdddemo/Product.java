package com.example.cucumberbdddemo;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class Product {

    Map<String, Integer> products;

    @PostConstruct
     public void setup()
    {
        this.products = new ConcurrentHashMap<>();
    }


    public void giveCosts(String product,int cost){
        System.out.println("Giving cost to" + product + ": " + cost);
        this.products.put(product, cost);
    }

    public int calculate(String product, int count){
        System.out.println("Calculating " + product);
        return this.products.get(product) * count;
    }
}

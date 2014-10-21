package com.anirudh.practice.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anirudh on 21/10/14.
 */
public class NYStyleCheesePizza extends Pizza{

    public NYStyleCheesePizza() {
        setName("NY Style Cheese Pizza");
        setDough("NY dough");
        setSauce("Red NY Sauce");
        setPrice("Rs. 200");
        toppings.add("Pepporoni");
        toppings.add("Cheese");
        toppings.add("Tomato");
        prepare();
    }
}

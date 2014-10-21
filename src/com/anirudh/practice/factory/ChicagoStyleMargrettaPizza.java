package com.anirudh.practice.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anirudh on 21/10/14.
 */
public class ChicagoStyleMargrettaPizza extends Pizza {

    public ChicagoStyleMargrettaPizza() {
        setName("Chicago Style Margretta Pizza");
        setDough("Chicago dough");
        setSauce("Red Chicago Sauce");
        setPrice("Rs. 250");
        toppings.add("Chicken");
        toppings.add("Thick Cheese");
        toppings.add("Basil");
        prepare();
    }

}

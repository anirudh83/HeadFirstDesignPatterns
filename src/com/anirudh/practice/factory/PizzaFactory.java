package com.anirudh.practice.factory;

/**
 * Created by anirudh on 21/10/14.
 */
public class PizzaFactory {

    public Pizza getNYStyleCheesePizza() {
        return new NYStyleCheesePizza();
    }

    public Pizza getChicagoStylePizza(){
        return new ChicagoStyleMargrettaPizza();
    }
}

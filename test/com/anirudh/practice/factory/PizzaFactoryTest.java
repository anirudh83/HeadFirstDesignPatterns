package com.anirudh.practice.factory;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by anirudh on 21/10/14.
 */
public class PizzaFactoryTest {

    private PizzaFactory pizzaFactory;

    @Before
    public void init(){
        pizzaFactory = new PizzaFactory();
    }

    @Test
    public void shouldCreateChicagoStylePizza(){
        Pizza chicagoStylePizza = pizzaFactory.getChicagoStylePizza();
        assertEquals("Rs. 250", chicagoStylePizza.getPrice());
    }

    @Test
    public void shouldCreateNYStylePizza(){
        Pizza nyStyleCheesePizza = pizzaFactory.getNYStyleCheesePizza();
        assertEquals("Rs. 200", nyStyleCheesePizza.getPrice());
    }
}

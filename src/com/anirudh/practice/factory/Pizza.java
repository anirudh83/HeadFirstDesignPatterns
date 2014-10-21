package com.anirudh.practice.factory;

import com.anirudh.practice.callback.StrugglingActorCallback;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anirudh on 21/10/14.
 */
public abstract class Pizza {

    private String name;
    private String dough;
    private String sauce;
    private String price;

    List<String> toppings = new ArrayList<String>();

    public void prepare(){
        System.out.println("Preparing .." + name);
        System.out.println("Using dough .."+dough);
        System.out.println("Using sauce .."+sauce);
        System.out.println("Ading Toppings ..");
        for(String topping : toppings){
            System.out.println(topping);
        }
        System.out.println("Pizza is ready ..");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}

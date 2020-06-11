package com.isaxved.Week1.Week10_FactoryPattern;

import java.util.ArrayList;

public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected ArrayList<String> toppings = new ArrayList<String>();

    public void prepare(){
        System.out.println("preparing: " + name + " and " + dough);
        System.out.println("adding" + sauce);
        System.out.println("adding toppings: ");
        for (String topping : toppings) {
            System.out.println(" " + topping);
        }
    }
    public void cut(){
        System.out.println("cutting pizza in 8 pieces");
    }
    public void box(){
        System.out.println("Packing a delicious pizza");
    }
    public void bake(){
        System.out.println("baking pizza for 20 min");
    }
}

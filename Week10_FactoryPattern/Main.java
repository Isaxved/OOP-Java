package com.isaxved.Week1.Week10_FactoryPattern;

import com.isaxved.Week1.Week10_FactoryPattern.Factory.SimplePizzaFactory;
import com.isaxved.Week1.Week10_FactoryPattern.PizzaStore.PizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        Pizza pizza = pizzaStore.orderPizza("cheese");
        pizza.pizzaName();
    }
}

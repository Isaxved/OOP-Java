package com.isaxved.Week1.Week10_FactoryPattern.PizzaStore;

import com.isaxved.Week1.Week10_FactoryPattern.Factory.SimplePizzaFactory;
import com.isaxved.Week1.Week10_FactoryPattern.Pizza;

public class PizzaStore {
    SimplePizzaFactory simplePizzaFactory;

    public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = simplePizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}

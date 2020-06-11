package com.isaxved.Week1.Week10_FactoryPattern.Factory;

import com.isaxved.Week1.Week10_FactoryPattern.ConcretePizza.CheesePizza;
import com.isaxved.Week1.Week10_FactoryPattern.Pizza;

public class SimplePizzaFactory {

    public SimplePizzaFactory() {

    }

    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        }
        return pizza;
    }
}

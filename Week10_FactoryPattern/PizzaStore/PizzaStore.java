package com.isaxved.Week1.Week10_FactoryPattern.PizzaStore;

import com.isaxved.Week1.Week10_FactoryPattern.Factory.SimplePizzaFactory;
import com.isaxved.Week1.Week10_FactoryPattern.Pizza;

public abstract class PizzaStore {
    SimplePizzaFactory simplePizzaFactory;

    public PizzaStore() {

    }

    public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }

    protected abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}

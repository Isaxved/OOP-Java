package com.isaxved.Week1.Week10_FactoryPattern.PizzaStore;

import com.isaxved.Week1.Week10_FactoryPattern.ConcretePizza.ChicagoStyleCheesePizza;
import com.isaxved.Week1.Week10_FactoryPattern.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

    public ChicagoPizzaStore() {

    }

    @Override
    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
            return pizza;
        }
        return pizza;
    }
}

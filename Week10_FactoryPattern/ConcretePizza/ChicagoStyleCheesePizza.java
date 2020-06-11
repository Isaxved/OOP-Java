package com.isaxved.Week1.Week10_FactoryPattern.ConcretePizza;

import com.isaxved.Week1.Week10_FactoryPattern.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago style pizza";
        sauce = "Pomodoro";
        dough = "somegtin";

        toppings.add("cheese");
    }
}

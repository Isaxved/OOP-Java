package com.isaxved.Week1.Week9_DecoratorPattern.ConcreteBeverage;

import com.isaxved.Week1.Week9_DecoratorPattern.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        setDescription("Espresso");
    }

    @Override
    public double cost() {
        return 1.99;
    }
}

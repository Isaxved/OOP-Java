package com.isaxved.Week1.Week9_DecoratorPattern.ConcreteBeverage;

import com.isaxved.Week1.Week9_DecoratorPattern.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        setDescription("House blend coffee");
    }

    @Override
    public double cost() {
        return .89;
    }
}

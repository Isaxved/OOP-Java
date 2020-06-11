package com.isaxved.Week1.Week9_DecoratorPattern.ConcreteDecorators;

import com.isaxved.Week1.Week9_DecoratorPattern.Beverage;
import com.isaxved.Week1.Week9_DecoratorPattern.CondimentDecorator;

public class Soy extends CondimentDecorator {

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + .30;
    }
}

package com.isaxved.Week1.Week9_DecoratorPattern.ConcreteDecorators;

import com.isaxved.Week1.Week9_DecoratorPattern.Beverage;
import com.isaxved.Week1.Week9_DecoratorPattern.CondimentDecorator;

public class Whip extends CondimentDecorator {

    private Beverage beverage;

    public Whip(Beverage beverage) {
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
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }
}

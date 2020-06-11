package com.isaxved.Week1.Week9_DecoratorPattern;

import com.isaxved.Week1.Week9_DecoratorPattern.ConcreteBeverage.Espresso;
import com.isaxved.Week1.Week9_DecoratorPattern.ConcreteDecorators.Mocha;
import com.isaxved.Week1.Week9_DecoratorPattern.ConcreteDecorators.Whip;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription() + beverage.cost());
    }
}

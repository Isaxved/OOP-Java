package com.isaxved.Week1.Week10_FactoryPattern.ConcretePizza;

import com.isaxved.Week1.Week10_FactoryPattern.Pizza;

public class CheesePizza extends Pizza {

    @Override
    public void pizzaName() {
        System.out.println("I am a cheese pizza");
    }

    @Override
    public void prepare() {
        System.out.println("we prepare it");
    }

    @Override
    public void cut() {
        System.out.println("we cut it");
    }

    @Override
    public void box() {
        System.out.println("we box it");
    }

    @Override
    public void bake() {
        System.out.println("we bake it");
    }
}

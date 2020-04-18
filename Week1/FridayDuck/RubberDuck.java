package com.isaxved.Week1.Week1.FridayDuck;

public class RubberDuck extends Duck {

    public RubberDuck() {
        quackBehavior = new Squick();
        flyBehavior = new FlyNoWay();
    }

}

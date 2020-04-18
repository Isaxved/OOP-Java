package com.isaxved.Week1.Week1.FridayDuck;

public abstract class Duck {

    Quackable quackBehavior;
    Flyable flyBehavior;

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("I am swimming");
    }

    public void display() {
        System.out.println("I am a duck");
    }

}

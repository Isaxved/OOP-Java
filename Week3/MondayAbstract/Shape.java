package com.isaxved.Week1.Week3.MondayAbstract;
// abstract -> can be used to methods and classes.
// final -> can be used to classes, methods and fields.
// static ->
public abstract class Shape {
    private int numberOfSides;
    // 1. If you have abstract methods, then class should be abstract.
    // 2. Abstract methods does not have bodies.
    // 3. Children classes should implement all the abstract methods.
    abstract public void display();
    abstract public void area();
}

package com.isaxved.Week1.Week3.MondayAbstract;

public class Circle extends Shape{

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void display() {
        System.out.println("Drawing a circle");
    }

    @Override
    public void area() {
        System.out.println("Area is:" + radius * radius * 3.14);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}


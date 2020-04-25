package com.isaxved.Week1.Week3.MondayAbstract;

public class Square extends Shape{

    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public void display() {
        System.out.println("Drawing a square");
    }

    @Override
    public void area() {
        System.out.println("Area is:");
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}

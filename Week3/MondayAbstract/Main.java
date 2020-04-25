package com.isaxved.Week1.Week3.MondayAbstract;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(3);
        Shape square = new Square(2);

        List<Shape> createdShapes = new ArrayList<Shape>();
        createdShapes.add(circle);
        createdShapes.add(square);

        ArrayList<Shape> list = new ArrayList<Shape>();

        for (Shape shape : createdShapes) {
            shape.display();
        }
    }
}

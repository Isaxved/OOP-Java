package com.isaxved.Week1.Week9_DecoratorPattern;

public abstract class Beverage {
    private String description = "Unknown beverage";

    public abstract double cost();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

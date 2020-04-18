package com.isaxved.Week1.Week1.Thursday;

public class Employee {
    private String name;
    private double rate;
    private double hours;
    private static int totalSum;

    public Employee() {
        totalSum += 8;
    }
    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
        totalSum += 8;
    }
    public Employee(String name,int rate,double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += 8;
    }

    public double bonuses() {
        return salary() * 0.1;
    }

    public double salary() {
        return getRate() * getHours();
    }

    public void tostring() {
        System.out.println(getName() + " " + getHours() + " " + getRate());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public static int getTotalSum() {
        return totalSum;
    }

    public static void setTotalSum(int totalSum) {
        Employee.totalSum = totalSum;
    }
}

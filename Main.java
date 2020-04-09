package com.isaxved.Week1;

public class Main {

    public static void main(String[] args) {

        Employee one = new Employee("Azat",10,10);
        Employee two = new Employee("Az",10,10);
        Employee three = new Employee("Aza",10,10);

        one.tostring();
        System.out.println(Employee.getTotalSum());
        System.out.println(one.bonuses());

        Person a = new Person();
        Person b = new Person();
        Person c = new Person();
        Person d = new Person();
        Person e = new Person();

        a.input("a",1900);
        b.input("b",1901);
        c.input("c",1902);
        d.input("d",1903);
        e.input("e",1904);

        a.output();
    }
}

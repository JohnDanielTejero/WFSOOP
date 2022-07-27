package com.oop.concepts.oopparadigm.constructorsAndDestructorsSample;

public class Car {
    private String make;
    private String model;
    private double price;

    private Car(){}


    public Car(String make, String model, double price){
        this.make = make;
        this.model = model;
        this.price = price;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Car is destroyed by Garbage Collector!");
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}

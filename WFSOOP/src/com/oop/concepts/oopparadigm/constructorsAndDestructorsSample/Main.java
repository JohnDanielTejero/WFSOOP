package com.oop.concepts.oopparadigm.constructorsAndDestructorsSample;

public class Main {
    public static void main(String[] args) {

        //constructor
        Car car = new Car("Nissan", "Sedan", 20000.00);
        System.out.println(car);

        //destructor
        car = null;
        System.gc();
    }
}

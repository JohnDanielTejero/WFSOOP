package com.oop.concepts.oopparadigm.polymorphismSample;

//method overloading
public class Calculate {

    public int addNumber(int x, int y){
       return x + y;
    }

    public double addNumber(double x, double y){
        return x + y;
    }

    public int addNumber(int x){
        return x + x;
    }

    public double addNumber(double x){
        return x + x;
    }

}


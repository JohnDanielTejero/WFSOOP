package com.oop.concepts.oopparadigm.interfaceSample;

public class Main {
    public static void main(String[] args) {

        Shape normalShape = new ShapeFactory("Square", "normal").createShape();
        normalShape.draw();

        Shape roundedShape = new ShapeFactory("Circle", "rounded").createShape();
        roundedShape.draw();

    }
}

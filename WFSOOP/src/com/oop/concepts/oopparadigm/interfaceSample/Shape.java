package com.oop.concepts.oopparadigm.interfaceSample;

public abstract class Shape {

    private String shapeName;

    public Shape(){

    }

    public Shape(String shapeName){
        this.shapeName = shapeName;
    }

    public void draw(){
        System.out.println("drawing: " + shapeName);
    }
}

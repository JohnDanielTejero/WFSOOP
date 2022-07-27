package com.oop.concepts.oopparadigm.interfaceSample;

public class RoundedShapes extends Shape implements RoundedShapeType{
    public RoundedShapes(){
        super();
    }

    public RoundedShapes(String shapeName){
        super(shapeName);
    }

    @Override
    public void draw() {
        super.draw();
        sayRounded();
    }

    @Override
    public void sayRounded() {
        System.out.println("this is a rounded shape");
    }
}

package com.oop.concepts.oopparadigm.interfaceSample;

public class NormalShapes extends Shape implements NormalShapeType{

    public NormalShapes(){
        super();
    }

    public NormalShapes(String shapeName){
        super(shapeName);
    }

    @Override
    public void draw() {
        sayNormalShape();
        super.draw();
    }

    @Override
    public void sayNormalShape() {
        System.out.println("this is a normal shape");
    }
}

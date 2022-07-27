package com.oop.concepts.oopparadigm.interfaceSample;

public class ShapeFactory {

    private String shapeName;
    private String shapeType;

    private ShapeFactory(){}

    public ShapeFactory(String shapeName, String shapeType){
      this.shapeName = shapeName;
      this.shapeType = shapeType;
    };

    public Shape createShape(){
        if (shapeType.equalsIgnoreCase("rounded")){
            return new RoundedShapes(shapeName);
        }else if (shapeType.equalsIgnoreCase("normal")){
            return new NormalShapes(shapeName);
        }else{
            return null;
        }
    }

}

package com.oop.concepts.oopparadigm.abstractSample;

public class WaterAnimal extends Animal{

    public WaterAnimal(String name) {
        super(name);
    }

    @Override
    public String toMove() {
        return "it can swim";
    }

    @Override
    public String animalType() {
        return super.getName() + " is a water animal";
    }

    @Override
    public void animalActionAndType() {
        System.out.print(animalType() + " ");
        super.animalActionAndType();
    }
}

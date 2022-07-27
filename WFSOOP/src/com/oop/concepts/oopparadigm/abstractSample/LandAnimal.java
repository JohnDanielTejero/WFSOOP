package com.oop.concepts.oopparadigm.abstractSample;

public class LandAnimal extends Animal{
    public LandAnimal(String name) {
        super(name);
    }

    @Override
    public String toMove() {
        return "it can walk";
    }

    @Override
    public String animalType() {
        return super.getName() + " is land animal";
    }

    @Override
    public void animalActionAndType() {
        System.out.print(animalType() + " ");
        super.animalActionAndType();
    }
}

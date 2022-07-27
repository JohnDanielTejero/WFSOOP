package com.oop.concepts.oopparadigm.abstractSample;

public class AirAnimal extends Animal{
    public AirAnimal(String name) {
        super(name);
    }

    @Override
    public String toMove() {
        return "it can fly";
    }

    @Override
    public String animalType() {
        return super.getName() + " is an air animal";
    }

    @Override
    public void animalActionAndType() {
        System.out.print(animalType() + " ");
        super.animalActionAndType();
    }
}

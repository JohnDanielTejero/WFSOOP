package com.oop.concepts.oopparadigm.abstractSample;

public class Main {
    public static void main(String[] args) {
        Animal dog = new AnimalFactory("Dog", "LandAnimal").generateAnimal();
        dog.animalActionAndType();

        Animal fish = new AnimalFactory("fish", "WaterAnimal").generateAnimal();
        fish.animalActionAndType();

        Animal bird = new AnimalFactory("bird", "AirAnimal").generateAnimal();
        bird.animalActionAndType();

        Animal dog2 = new AnimalBuilder().setAnimalType("LandAnimal").setName("doggo").create();
        dog2.animalActionAndType();
    }
}

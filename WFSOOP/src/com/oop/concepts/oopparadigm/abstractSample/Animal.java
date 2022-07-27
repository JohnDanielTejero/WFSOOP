package com.oop.concepts.oopparadigm.abstractSample;

public abstract class Animal {

    private String name;

    public Animal(String name){
        this.name = name;
    }
    public String toMove(){
        return null;
    }

    public abstract String animalType();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void animalActionAndType(){
        System.out.println(toMove());
    }
}

package com.oop.concepts.oopparadigm.abstractSample;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AnimalBuilder {
    private String animalName;
    private String animalType;


    public AnimalBuilder(){}

    public AnimalBuilder setName(String name) {
        this.animalName = name;
        return this;
    }

    public AnimalBuilder setAnimalType(String animalType) {
        this.animalType = animalType;
        return this;
    }

    public Animal create(){

        if (this.animalName == null || this.animalType == null){
            throw new IllegalArgumentException("one or all fields are not filled");
        }else{
            Class<? extends Animal> animal;
           // Object instance = null;
            try {
                animal = (Class<? extends Animal>) Class.forName("com.oop.concepts.oopparadigm.abstractSample." + animalType);
                Constructor<?>[] constructor = animal.getConstructors();
                //Constructor useConstructor = null;
                for (int i = 0; i < constructor.length; i++) {
                    Class<?>[] param = constructor[i].getParameterTypes();
                    if (constructor[i].getParameterTypes().length == 1 && param[0].getName().equals("java.lang.String")) {
                        return (Animal) constructor[i].newInstance(this.animalName);
                        //break;
                    }
                }
                //instance = useConstructor.newInstance(this.animalName);

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
           // return (Animal) instance;
        }
        return null;
    }
}

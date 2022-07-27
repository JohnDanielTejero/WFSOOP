package com.oop.concepts.oopparadigm.abstractSample;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AnimalFactory {

    private String animalName;
    private String animalType;

    private AnimalFactory(){}

    public AnimalFactory (String animalName, String animalType){
        this.animalName = animalName;
        this.animalType = animalType;
    }

    public Animal generateAnimal(){

        Class<? extends Animal> animal;
        Object instance = null;
        try {
            animal = (Class<? extends Animal>) Class.forName("com.oop.concepts.oopparadigm.abstractSample." + animalType);
            Constructor<?>[] constructor = animal.getConstructors();
            Constructor useConstructor = null;
            for (int i = 0; i < constructor.length; i++){
                Class<?>[] param = constructor[i].getParameterTypes();
                if (constructor[i].getParameterTypes().length == 1 && param[0].getName().equals("java.lang.String")) {
                    useConstructor = constructor[i];
                    break;
                }
            }
            instance = useConstructor.newInstance(this.animalName);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
//        if (this.animalType.equalsIgnoreCase("land")){
//            return new LandAnimal(this.animalName);
//        }else if (this.animalType.equalsIgnoreCase("water")) {
//            return new WaterAnimal(this.animalName);
//        }else if (this.animalType.equalsIgnoreCase("air")){
//            return new AirAnimal(this.animalName);
//        }else{
//            return null;
//        }
        return (Animal) instance;
    }
}

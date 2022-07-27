package com.oop.concepts.oopparadigm.encapsulationSample;

public class Main {
    public static void main(String[] args) {

        //context use
        Student student1 = new Student("John Daniel", "Tejero",
                "BAUN-BDSEO3", 'M');
        Student student2 = new Student("Sample", "Student",
                "BAUN-BDSEO3", 'F');
        System.out.println(student1);
        System.out.println(student2);
    }
}

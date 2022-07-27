package com.oop.concepts.oopparadigm.polymorphismSample;

public class Main {
    public static void main(String[] args) {

        //method overloading
        Calculate calculate = new Calculate();

        //implementation
        System.out.println(calculate.addNumber(3));
        System.out.println(calculate.addNumber(3.5));
        System.out.println(calculate.addNumber(3 + 3));
        System.out.println(calculate.addNumber(3.5 + 1.2));

        //method overriding
        DoAction doAction = new DoAction();
        doAction.doSomething();

        Run run = new Run();
        run.doSomething();

        Swim swim = new Swim();
        swim.doSomething();

    }
}

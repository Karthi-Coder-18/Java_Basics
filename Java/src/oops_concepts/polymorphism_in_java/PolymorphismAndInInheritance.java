package oops_concepts.polymorphism_in_java;

import oops_concepts.abstraction.ClassInterface;
import oops_concepts.inheritence_in_java.MultipleInHeritence;

public class PolymorphismAndInInheritance implements ClassInterface, MultipleInHeritence {


    public static void main(String[] args) {

        add();
        add(1.2f, 3.4f);
    }

    // METHOD OVERLOADING AKA COMPILE TIME POLYMORPHISM
    // Method overloading is used when a method inside a class is having two different methods with the same name and different parameters. It can also be done by changing the data types of parameter included.
    private static void add() {

        int sum = 3 + 4;
        System.out.println(sum);
    }

    private static void add(float a, float b) {
        double sum = a + b;
        System.out.println(sum);
    }

    // METHOD OVERRIDING AKA RUN TIME POLYMORPHISM

    @Override
    public int setRuns(int value) {
        return 0;
    }

    @Override
    public void data() {
    }

    // When a return type is provided to one of the abstract methods inside an Interface, why does the class can't implement both methods? why class is throwing an error?

}

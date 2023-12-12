package practice;

abstract class AbstractClass {
    public static void main(String[] args){
        System.out.println(setData());


    }

    public static void setField(){

    }

    private static int setData(){
        return 10;
    }

    /*public abstract void getValues(){

    }
    // Abstract methods inside an abstract class cannot have body.
    -> An abstract class can have both abstract and non-abstract methods inside it.

    */

    /*
    Abstraction is a process of hiding the implementation details and showing only functionality to the user.
    An abstract class can have data member, abstract method, method body, constructor and even main() method
    If there is any abstract method in a class, that class must be abstract.
    If extending any abstract class that have abstract method, we must either provide the implementation of the method or make this class abstract.
    Abstract methods must be implemented when extending an abstract class the other non-abstract methods are left to developer's choice.

     *   Rules for abstract keyword:
     *       1. Abstract class:
     *           * A class that is declared abstract
     *           * You cannot create an object of abstract class
     *           * It may or may not contain abstract methods
     *
     *       2. abstract methods:
     *           * No method body. You cannot write code in abstract method.
     *           * It is mandatory to override the abstract method in child class.
     * */
}

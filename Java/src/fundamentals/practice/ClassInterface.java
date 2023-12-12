package practice;

public interface ClassInterface {

  //  private int value = 100; PRIVATE access modifier is not allowed in interface

    /*
    Interface is a mechanism used to attain complete ABSTRACTION in Java. IS-A relationship.
    Interface supports MULTI-INHERITANCE
    An interface with no member is called marker/tagged interface. For example, Serializable, Cloneable, Remote etc.
    An interface can have another interface i.e., known as nested interface.
     *   Rules of Interface
     *       * You cannot create an object of interface. They are just a blueprint of a class.
     *       * Use implements keyword
     *       * They can only contain abstract methods.
     *       * The Java compiler adds public & abstract before the interface method. Adds public, static & final before data members.
             * A class extends another class, an interface extends another interface, but a class implements an interface.

     *       1. For Methods,
     *           * They are public and abstract
     *           * No method body. You cannot write code within your method.
     *           * Since Java 8 methods inside an interface can have body, but only if they are declared with STATIC or DEFAULT keyword.
     *
     *       2. For Variables,
     *           * Avoid using field variables,
     *           * But when used they are constants. Their values cannot be changed once defined.
     *           * They are public, static and final
     *
     * */


    public int a = 10;

    public void data();

    public int setRuns(int value);

   /* public void get(){
        System.out.println();
    }
    Abstract methods inside an Interface cannot have body.
    */
}

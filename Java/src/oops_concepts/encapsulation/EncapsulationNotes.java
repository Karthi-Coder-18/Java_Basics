package oops_concepts.encapsulation;

public class EncapsulationNotes {



    // In Java, Encapsulation is used to bundle or holding the members and methods of a class together as a capsule. It is a way to hide data from other classes and only make the getters and setters available to other class through the object of the class.
    // Hiding of class data using private access modifiers
    // Wrapping the data members & functions using private access modifiers using Getters & setters
    // Creating an Instance of the class inside another class using CONSTRUCTOR


    private String batter; //using the private access modifier to hide the data from other classes
    private String bowler;

    // Constructor inside an encapsulated class is used to initilize an object or instance of a specific class inside another to access the members of object class.
    // Constructor must have the same name as the class
    // Used to initilize the instance variables of the class.

//   public Encapsulation (String batter, String bowler){
//        this.batter = batter;
//        this.bowler = bowler;
//    }


    // Setters provide Write-Only access to the data inside the object class.
    public void setBatter(String batter){
        this.batter = batter;
    }

    public void setBowler(String bowler){
        this.bowler = bowler;
    }

    // Getters provide Read-Only access to the data inside the object class.
    public String getBatter(){
        return batter;
    }

    public String getBowler(){
        return bowler;
    }
}

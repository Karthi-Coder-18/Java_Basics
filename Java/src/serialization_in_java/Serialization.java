package serialization_in_java;

//import javax.imageio.IIOException;
import java.io.*;

import oops_concepts.encapsulation.EncapsulationNotes;

public class Serialization implements Serializable {

    public static void main(String[] args) {
        EncapsulationNotes en = new EncapsulationNotes();

        double d = 222.0202;

        int sum = (int) d;

        System.out.println(sum);
        en.setBatter("karthik");
        en.setBowler("Naveen");

        try{
            FileOutputStream fStream = new FileOutputStream("kt.txt");
            ObjectOutputStream oStream = new ObjectOutputStream(fStream);
            oStream.writeObject(en);
            oStream.close();
            fStream.close();
        }catch (IOException e){
            System.out.println("Caught");
        }
    }

    // Serialization is converting a state of an object into Byte Stream.

/*
https://stackoverflow.com/questions/2232759/what-is-the-purpose-of-serialization-in-java

    While you're running your application, all of its objects are stored in memory (RAM).
    When you exit, that memory gets reclaimed by the operating system, and your program essentially 'forgets' everything that happened while it was running.
    Serialization remedies this by letting your application save objects to disk, so it can read them back the next time it starts.
    If your application is going to provide any way of saving/sharing a previous state, you'll need some form of serialization.

    Serialization is simply turning an existing object into a byte array. This byte array represents the class of the object, the version of the object, and the internal state of the object. This byte array can then be used between JVM's running the same code to transmit/read the object.

    Why would we want to do this?

    There are several reasons:

    Communication: If you have two machines that are running the same code, and they need to communicate, an easy way is for one machine to build an object with information that it would like to transmit, and then serialize that object to the other machine. It's not the best method for communication, but it gets the job done.

    Persistence: If you want to store the state of a particular operation in a database, it can be easily serialized to a byte array, and stored in the database for later retrieval.

    Deep Copy: If you need an exact replica of an Object, and don't want to go to the trouble of writing your own specialized clone() class, simply serializing the object to a byte array, and then de-serializing it to another object achieves this goal.

    Caching: Really just an application of the above, but sometimes an object takes 10 minutes to build, but would only take 10 seconds to de-serialize. So, rather than hold onto the giant object in memory, just cache it out to a file via serialization, and read it in later when it's needed.

    Cross JVM Synchronization: Serialization works across different JVMs that may be running on different architectures.
*/





}

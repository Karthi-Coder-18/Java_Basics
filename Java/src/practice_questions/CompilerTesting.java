package practice_questions;

public class CompilerTesting {

    String name;
    String title;
    String author;

    public static void main(String[] args) {
        CompilerTesting[] h = new CompilerTesting[4];
        int z = 0;

        h[0] = new CompilerTesting(); // Without assigning the objects to all the elements inside an array, they won't get instantiated.
        h[1] = new CompilerTesting();
        h[2] = new CompilerTesting();
        h[3] = h[2]; // This object will take the above element object as a reference.

        h[0].title = "hunger";
        h[1].title = "black";
        h[2].title = "passion";
        h[0].author = "Kohli";
        h[1].author = "Karthik";
        h[2].author = "Kobe bryant";

        while (z < 4) {
            System.out.print(h[z].title);
            System.out.print(" by ");
            System.out.println(h[z].author);
            z = z + 1;
        }
    /*    while (z < 2) {
            z = z + 1;
            h[z] = new CompilerTesting();
            h[z].name = "bilbo";
            if (z == 1) {
                h[z].name = "frodo";
            }
            if (z == 2) {
                h[z].name = "sam";
            }
            System.out.print(h[z].name + " is a ");
            System.out.println("good Hobbit name");
        }*/
    }
}


// IF we assign the condition as z < 3 || z < 4, then we will get an arryindexoutofboundexception because we are trying to create extra objects by increasing the Z value inside the while condition.

// When we create an array of objects, it is like we are just declaring a number of objects. In order for them to work, we need to instantiate whatever length or number we have provided for that array.

// if we don't follow the above condition, we will face NullPointerException during the compile time process.
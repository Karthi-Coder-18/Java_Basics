package practice;

public class Arrays {

    public static void main(String[] args) {

        String[] names = new String[2]; // To declare an array, define a data type along with square brackets and variable name, then assign the array of variables to new instance of the datatype along with the number of index positions required.
        names[0] = "karthik"; // Now use the variable name along with index position
        names[1] = "Naveen";

        double[] values = {22.03, 77.09, 33.98}; // To directly assign values to an array use flower

        System.out.println(names[1] + " " + values[1]);


        int[] numbers = {1, 2, 3, 4};

        for (int i = 0; i < numbers.length; i++) { // This Outer loop will loop through all the index values of the array used

            for (int j = 0; j <= i; j++) { // The inner loop will loop multiple times as per the index value of the array. Everytime the outer loop completes, the inner loop value will be 0, until unless it matches the outer loop value it prints the data.
                System.out.print(numbers[i] + "");
            }
            System.out.println();

        }

        Rectangle[] array = new Rectangle[2]; // Syntax to create an array of objects
        array[0] = new Rectangle(); // Syntax to assign object reference to every index of the array
        System.out.println(array[0].breadth); // Syntax to call the member functions or variables of the associated class object.

        Rectangle.data = 100;// This is how static variable or methods can be accessed from any class, as the static keyword is global.


    }

}

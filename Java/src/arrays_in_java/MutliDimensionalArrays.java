package arrays_in_java;

public class MutliDimensionalArrays {
    // Horizental: Left to Right.
    // Vertical: Top to Bottom.
    public static void main(String[] args) {

        int[][] twoDArray = new int[3][4];

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 4; j++) {
                twoDArray[i][j] = (int) (Math.random() * 100);
                System.out.print(twoDArray[i][j] + " ");
            }

            System.out.println();

        }


        //2D ARRAYS IN JAVA 

        twoDArray[0][0] = 100; // Do remember that the Outer loop which loops through the arrays present will also starts it's index value from 0.
        twoDArray[0][1] = 200;
        twoDArray[0][2] = 300;
        twoDArray[0][3] = 400;

        for (int i = 0; i < 3; i++) {// This outer loop is used to loop through all the AARAYS present inside the
                                     // single big Array.

            for (int j = 0; j < 4; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }

        for (int[] i : twoDArray) {
            for (int j : i) { // Here J is taking each element from the i Array and then we can print the
                              // value of J as it takes every element value from Array i.
                System.out.print(j + " ");
            }
            System.out.println();
        }

        int[][] data = new int[3][]; // we left the 2nd square bracket empty as we do not want to mention / use same
                                     // number of elements for each array inside the big array.






        //JAGGED ARRAYS IN JAVA 

        data[0] = new int[3]; // we are specifically changing the length/size of every array inside the 2D Array.
        data[1] = new int[4];
        data[0][0] = 100;
        data[2] = new int[1];

        // How to loop through JAGGED arrays in 2D array

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }

    }

}

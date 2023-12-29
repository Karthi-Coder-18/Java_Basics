package practice_questions;

public class TestArrays {

    public static void main(String[] args) {
        String[] islands = new String[4];

        islands[0] = "Bermuda";

        islands[1] = "Fiji";
        islands[2] = "Andaman";
        islands[3] = "Nicobar";


        int[] index = new int[4];  // Here we have assigned an int value to each of the elements inside the index array.
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;

        int y = 0;

        int ref;


        while (y < 4) {

            ref = index[y]; // for the ref variable, we have assigned the index array element,
            // the element index numbers will change based on the y variable value.
            System.out.println(islands[ref]);
            y = y + 1;


        }


    }

}

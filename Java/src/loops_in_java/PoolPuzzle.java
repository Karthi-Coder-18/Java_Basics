package loops_in_java;


// No matter what condition you write in the While loop, one thing that needs to be remembered is that what is the initial value being provided and the initial condition being provided.

// Based on these two points we can determine the result of the loop

// If the conditional statements inside the loop doesn't match the initial while loop condition it is to be considered as false and the loop skips that conditional statement until unless it becomes TRUE.

// It is not mandatory for the conditional statements to be in an order inside the loop. It completely depends upon the problem statement provided.
public class PoolPuzzle {
    public static void main(String[] args) {

        int x = 0;

        while (x < 4) {

            System.out.print("a ");

            if (x < 1) {
                System.out.print("");
            }
            System.out.print("n");


            if (x > 1) {
                System.out.print(" oyster");
                x = x + 2;
            }

            if (x == 1) {
                System.out.print("noys");
            }

            if (x < 1) {
                System.out.print("oise");
            }
            System.out.println();

            x = x + 1;

        }

    }
}

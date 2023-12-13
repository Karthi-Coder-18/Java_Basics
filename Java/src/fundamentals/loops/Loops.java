package loops;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Loops {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }

        int num = 10;
        int cars = 20;

        // The below while loop runs until the cars variable is less than 30 and stops looping whenever the condition is false.

        while (cars < 30) {
            cars++;
            System.out.println(num);
        }

        boolean name = false;

        while(!name){
            System.out.println("my name is karthik");
            break;
        }



        // Here first,we are printing a statement and checking if the condition provided inside while loop is true or false. Based on that we are looping the code inside do loop.
        do {
            System.out.println("Karthik" + num);
            num++;
        } while (num < 15);

        int x = 1;
        while (x < 3) {
            System.out.print("Doo");
            System.out.print("Bee");
            x = x + 1;
        }
        if (x == 3 ) {
            System.out.print("Do");
        }
    }
}

//The key to a loop is the conditional test. In Java, a conditional test is an expression that results in a boolean value—in other words, something that is either true or false.

// The result of a conditional test must be boolean!!

// The boolean test must be inside the parentheses of the loop

//As long as some condition is true, you do everything inside the loop block. The loop block is bounded by a pair of curly braces, so whatever you want to repeat needs to be inside that block.

// use comparison operations like >, <, == to run the boolean tests for the loops

// The print - prints the comment or the string value in the same line

// Println: Prints the comment or a string value in a new line !!

// There is not much difference between the [ if condition & while loop ]  instead of saying while there is some condition , we say if there is some condition.




















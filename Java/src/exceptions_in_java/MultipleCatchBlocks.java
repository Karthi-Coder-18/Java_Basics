package exceptions_in_java;

class KarthikException extends Exception {
    // Create an constructor for the class

    public KarthikException(String message) {
        super(message);
    }
}

public class MultipleCatchBlocks {

    public static void main(String[] args) {

    /*     // String[] names = { "karthi", "Surya", "Chiru" };

        double k = 2034.0202;

        int d = (int) k; //

        int i = 0;

        int j;

        try {
            j = 18 / i;
            if (j == 0)
                throw new KarthikException("My custom exception");
        } catch (KarthikException exception) {
            j = 19 / i;
            System.out.println("You cannot divide a number with zero!!" + exception);
        } /* catch (Exception e) {
            System.out.println("ooo");
        } 
        // System.out.println(j);
        System.out.println(d); */


        int i = 0;

        int j;

        try{
            j = 18/i;
            if(j==0)
            throw new KarthikException("Custom Exception");
        }catch(KarthikException e){
            j = 18/1;
            System.out.println("Karthi ");
        }

    }
}

// Always place the Exception class Catch block at the end of other catch blocks
// so that if there is any other unwanted exception occurs then the Exception
// class will catch the error.

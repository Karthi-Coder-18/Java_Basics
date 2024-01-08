package exceptions_in_java;

public class MultipleCatchBlocks {

    public static void main(String[] args) {

        String[] names = { "karthi", "Surya", "Chiru" };
        int i = 0;

        try {
            int j = 10 / i;
            System.out.println(j);
            System.out.println(names[4]); // when the exception occurs in one statement and then why does JVM does not go to next statement ? 
            
        } catch (ArithmeticException e) {
            System.out.println("Do not check for value out of array reach");
        } catch(Exception e){
            System.out.println("Exception class will catch this exception: " + e);
        }

    }
}


// Always place the Exception class Catch block at the end of other catch blocks so that if there is any other unwanted exception occurs then the Exception class will catch the error. 


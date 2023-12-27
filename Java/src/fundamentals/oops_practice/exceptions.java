package oops_practice;


//import com.sun.source.doctree.ThrowsTree;

public class exceptions {

    public static void main(String[] args) {
        System.out.println(voter(12));

    /*     Cricketers d = Cricketers.MONDAY;

        switch (d) { // Can't we directly place the ENUM class and switch through the different values inside the ENUM? 

            case MONDAY:
                System.out.println("Sunny");
                break;
            case TUESDAY:
                System.out.println("Cold!!");
            case WEDNESDAY:
                System.out.println("Hot");
            case THURSDAY:
                System.out.println("Nothing");
            default:
                System.out.println("failed");
        } */
    }

    // Checked exceptions have to be handled to satisfy the compiler.
    public static int voter(int age) {

        if (age > 18) {
            throw new ArithmeticException("Person is not eligible to vote");
        } else {
            System.out.println("Not eligible");
        }

        return age;
    }

    public static int play() throws ArrayIndexOutOfBoundsException {
        int x = 10;
        return x;
    }

}

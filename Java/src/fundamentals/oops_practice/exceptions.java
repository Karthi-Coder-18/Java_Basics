package oops_practice;

//import com.sun.source.doctree.ThrowsTree;

public class exceptions {

    public static void main(String[] args) {
        System.out.println(voter(121));


    }


    //Checked exceptions have to be handled to satisfy the compiler.
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

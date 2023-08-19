package practice.loops;

public class GreenBottles {

    public static void main(String[] args) {
        int bottles = 10;
        String word = "bottle";


        while (bottles > 0) {
            // The below if condition works only when the value of bottle comes down to 1 and then updates the string value.
            if (bottles == 1) {
                word = "karthik";
            }
            System.out.println(bottles + " green " + word + ", hanging on the wall");
            System.out.println(bottles + " green " + word + ", hanging on the wall");
            System.out.println("And if one green bottle should accidentally fall,");
            bottles = bottles - 1;  // This piece of code will reduce the bottles value by 1 everytime the while loop runs and eventually stops when the bottles value is 0.


            // as the bottles value is being cut down to 0 the if condition in line number 22 is false, the class will print the statement inside the else condition.
            if (bottles > 0) {
                System.out.println("There'll be " + bottles +
                        " green " + word + ", hanging on the wall");
            } else {
                System.out.println("There'll be no green bottles, hanging on the wall");
            }
        }
    }
}


// In Java the Strings are immutable : it means once the object of a string is being created it cannot be updated. then why does the above line number 13 is allowing me to update the string value ?

// We can use replace method or create a new String object in order to update the existing value.














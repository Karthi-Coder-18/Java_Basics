package practice_questions;

public class PalindromeString {

    public static void main(String[] args) {

        String test = "Sir";
        boolean r = palindromeStringJava(test);
        System.out.println(r);

    }


    // Creating a method which is of return type BOOLEAN value which checks if the provided
    public static boolean palindromeStringJava(String value) {

        String rev = ""; // Empty string to store reverse value of the actual string provided

        boolean result = false; // Boolean value to return the result

        // for loop will take the initial value as the length of String provided and keeps on decreasing the value until it meets the condition which equals 0.
        for (int i = value.length() - 1; i >= 0; i--) {
            rev = rev + value.charAt(i); // This will store each and every reversed character of string that is being provided as argument.
        }

        if (value.equals(rev)) {
            result = true; // This condition will check if the reversed string value is equal to the actual string value if yes returns true or will return false.
        }

        return result;
    }

}


/*
A String is said to be palindrome when it reads the same from LHS to RHS or RHS to LHS.
The Result will be a boolean value.
 */

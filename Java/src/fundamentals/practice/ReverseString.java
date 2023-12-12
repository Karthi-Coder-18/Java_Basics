package practice;

public class ReverseString {
    public static void main(String[] args) {
        String blogName = "java2blog";
        String reverse = "";
        for (int i = blogName.length() - 1; i >= 0; i--) {
            reverse = reverse + blogName.charAt(i);
        }
        System.out.println("Reverse of java2blog is: " + reverse);
    }
}


/*
In the above program, we are looping through a string which is of length 8. And using the decrement operator, we are printing the reverse value of the actual string assigned.

 */
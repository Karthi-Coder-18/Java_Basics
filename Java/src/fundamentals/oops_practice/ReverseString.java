package oops_practice;

public class ReverseString {

    public static void main(String[] args) {

       /* String text = "Kohli";

        String rev = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            rev = rev + text.charAt(i);
        }
        System.out.println(rev);
        */

        boolean value = isPalindrome("king");
        System.out.println(value);

    }

    public static boolean isPalindrome(String text){
        boolean result = false;

        String rev = "";

        for(int i=text.length()-1; i>=0; i--){
            rev = rev + text.charAt(i);
        }

        if(rev.equals(text)){
            result = true;
        }

        return result;
    }


}

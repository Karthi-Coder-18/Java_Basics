package exceptions_in_java;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        
        String str = "race";
        String str1 = "care";

        char[] c = str.toCharArray();
         Arrays.sort(c);
         String sortedStr = new String(c);


        char [] c1 = str1.toCharArray();
        Arrays.sort(c1);
        String sortedStr1 = new String(c1);

        boolean result;


        if(sortedStr.equalsIgnoreCase(sortedStr1)){

            result = true;
        }else {
            result = false;
        }

        System.out.println(result);



    }
}

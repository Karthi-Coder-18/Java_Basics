package practice.loops;

public class ForEachLoop {
    public static void main(String[] args) {

        String[] movies = new String[3];

        movies[0] = "Jigirithanda DoubleX";
        movies[1] = "Hi Nanna";
        movies[2] = "Salaar";

        for (String s : movies) {
            System.out.println(s);
        }

        /* 
         * One of the main reasons why for each loop being used is to loop through every VALUE of the Array provided. 
         * Instead of using a counter and incrementing each value of the array and printing it, use for loop to get the array values directly. 
         * When FOR EACH || ENHANCED FOR LOOP is used we are asking the loop to print VALUES but not the index number. 
         * The for each loop is used only for ARRAYS or to store the content related to ARRAYS [collections]
         */

    }
}

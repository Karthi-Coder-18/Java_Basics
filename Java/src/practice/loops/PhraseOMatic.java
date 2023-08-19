package practice.loops;

import java.util.Random;

public class PhraseOMatic {

    public static void main(String[] args) {

        // Here we are creating arrays and directly providing the values to that array. An array is nothing but set of variables.

        int[] num = new int[5];

        num[0] = 22;
        num[1] = 18;
        num[2] = 45;
        num[3] = 90;
        num[4] = 100;
        //    num [5] = 200; This will cause an arrayindexoutofbounds exception as the defined array length is 5 [ 0,1,2,3,4 ] which starts from 0 as index value


        String[] cricketers = {"Virat kohli", "Bazball", "Rohit", "sachin", "dinesh", "kallis"};

        String[] fruits = {"Apple", "banana", "watermelon", "grapes", "papaya"};

        String[] sports = {"cricket", "soccer", "basketball", "golf", "shuttle"};


        int array1 = cricketers.length;  // This .length method will return the number of words inside the array. [ 0 to 6 ]

        int array2 = fruits.length;

        int array3 = sports.length;


        Random random = new Random();

        int data1 = random.nextInt(array1); // When we provide the array1 variable the random method will pick a random value between [ 0 to 6 ]  and then returns that value when called.
        int data2 = random.nextInt(array2);
        int data3 = random.nextInt(array3);


        String phrase = cricketers[data1] + " " + fruits[data2] + " " + sports[data3] + " " + num[1];

        System.out.println("What we looking is for a " + phrase);

    }


}

















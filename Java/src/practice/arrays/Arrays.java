package practice.arrays;

public class Arrays {

    public static void main(String[] args) {
        num[0] = 100;
        num[1] = 100;
        num[2] = 100;
        num[3] = 100;
        num[4] = 100;

        int sum = num[0] + num[1] + num[2] + num[3];

        System.out.println("Sum is: " + sum);
        System.out.println(players[0] + " highest individual score in TEST format is " + sum);
    }

    static int[] num = new int[5];// here index will be defined, and the array can't hold more the value provided
    static String[] players = {"Lara's", "Naveen"}; // Here index is not defined, and the values can be provided as many as we want to.


}









































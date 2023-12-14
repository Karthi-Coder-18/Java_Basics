package practice.arrays;

public class Arrays {

    public static void main(String[] args) {
        int[] num = new int[5]; // When array is declared and the elements are yet to be initilized the default value of all the variables inside the DYNAMIC array would be 0.
        num[0] = 100;
        num[1] = 100;
        num[2] = 100;
        num[3] = 100;
        num[4] = 100;

        // To print all the elements inside an array use for or for each loop. Both does the same operation, i.e. looping through each and every element of the provided array using index value. 

        for (int i : num) {
            System.out.println(i);
        }

        for(int i=0; i<num.length; i++){
            System.out.println(num[i]);
        }

        int sum = num[0] + num[1] + num[2] + num[3];
        String[] players = {"Lara's", "Naveen"};
        players[0] = "Virat Kohli"; // To update an value inside a exisiting array use the index position of the element. 

        System.out.println("Sum is: " + sum);
        System.out.println(players[0] + " highest individual score in TEST format is " + sum);
    }

    
    

}









































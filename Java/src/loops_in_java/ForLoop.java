package loops_in_java;

public class ForLoop {
    public static void main(String[] args) {

        double[] dataType = { 22.04, 20.04, 18.04 };

        for (int i = 0; i < dataType.length; i++) {
            System.out.println(dataType[i]);
        }

        int[] scores = new int[4];

        scores[0] = 183;
        scores[1] = 254;
        scores[2] = 122;
        scores[3] = 116;

        for(int j : scores){
            System.out.println(j);
        }

        // For Loop do need 3 statements [ initial value, condition, increment/decrement statement]

        // For Each or Enhanced for loop can be used to loop through every value or element inside an array. 

        // For loop can also be used for the above requirement but use array.length(); method to set the condition. 

        

    }
}

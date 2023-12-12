package practice;

import practice.Encapsulation;

public class Loops extends Encapsulation {

  /*  Loops(String batter, String bowler) {
        super(batter, bowler);
    }*/

    @Override
    public String getBatter() {
        return super.getBatter();
    }

    @Override
    public String getBowler() {
        return super.getBowler();
    }

    public static void main(String[] args) {

        // FOR-LOOP
        for (int i = 0; i < 4; i++) { // The loop ends once the condition is satisfied.
            System.out.println(i);
        }


        // WHILE LOOP
        int k = 10;
        while (k <= 11) { // Unless this specified condition is satisfied, the loop continues to execute the code inside brackets.
            k = k + 1;
            System.out.println(k);
            if (k == 11) {
                continue;
            } // if this condition is satisfied, the loop will continue its execution
            break; // Break Keyword is used in Java to break the ongoing loop and shutdown the loop execution.
        }


        // DO-WHILE LOOP
        int d = 0;
        do {
            if (d % 2 == 0) {
                System.out.println(d);
            }
            d++;
        } while (d <= 20); // Unless this condition is satisfied, the above do block will continue to execute the code.



        // FOR-EACH LOOP -> For each loop is used to run through the order of an Array or collection, but the major drawback is that it can't run in reverse order for the same.

       /* for(data_type variable : array | collection){
             body of for-each loop
        }*/

        int[] numbers = {10,20,30,40,50};

        for(int i : numbers){
            System.out.println(i);
        }


    }
}

package oops_practice;

public class NumberRepeat {


    public static void main(String[] args) {


        int[] numbers = {1,2,3,4,5,6};

        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<i; j++){
                System.out.print(i);
            }
            System.out.println();
        }


    }




}

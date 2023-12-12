package oops_practice;

public class TypeConversion extends DataHiding{

    public static void main(String[] args) {

        int sum = 200;

        float d = sum;



        byte b = (byte) d;
        String value = Integer.toString(sum); // Converting an integer into String value in java

        System.out.println(value);


        String str = "Nav";
        String rev = "";
        for(int i=str.length()-1; i>=0;i--){
            rev = rev + str.charAt(i);
        }

        System.out.println(rev);

        // Widening Type Casting: Converting a lower data type to higher one. Automatically done
        // byte -> short -> int -> long -> float -> double

        //Narrowing Type casting: Converting a higher data type to lower one. Manually done.
        // double -> float -> long -> int -> short -> byte
    }


    @Override
    void members() {

    }

    @Override
    public void dataTypes() {
        super.dataTypes();
    }
}

package typecasting_in_java;

public class TypeCastingInJava {
    public static void main(String[] type){

        //TypeCasting : https://www.javatpoint.com/type-casting-in-java 


        //Widening Typecasting -> Converting a smaller data type into larger data type. Also known as Implicit conversion or down casting.
        //byte -> short -> char -> int -> long -> float -> double  

        int d = 200;
        double k = d; 
        System.out.println(k);

        //Narrowing Typecasting -> Converting a larger data type into smaller data type. Also known as Explicit conversion or casting up. 

        float f = 333202; 
        int i = (int) f;
        System.out.println(i);




    }
}

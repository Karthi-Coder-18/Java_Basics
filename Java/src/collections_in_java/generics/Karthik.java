package collections_in_java.generics;

class Data<T> {

    public T type; 

    public void setType(T type) {
        this.type = type;
    }

    public T getType() {
        return this.type;
    }

}

public class Karthik {

    public static void main(String[] arg) {

        Data<Integer> d = new Data<>();
        d.setType(200);

        // int result = d.getType(); This throws an compile time error as the Object type cannot be converted as int datatype.

        int result = d.getType(); // Now that we have Typecasted the Object type to an Integer class type it will not throw any errors.

        System.out.println(result);
        
        generiMethod(200.29);

    }

   /*   Generic methods in java 

     Benefits of Generic methods 
     1. When calling a method if we are not sure which values will be assigned or to be taken at the runtime it is better to use Generic type for the method. 
      below is the example for the same
     
     */

    public static <T> void generiMethod(T value){

        System.out.println(value);
    }


    /* 
     * Multiple Generic types for a method 
     * 
     * If there is a requirement of using multiple parameters while creating an method then we can use additional generic type. below is the example for the same. 
     * 
     */


     public static <T,U> void genericMultipleTypes(T key, U value){
       //return key + value;
     }
}

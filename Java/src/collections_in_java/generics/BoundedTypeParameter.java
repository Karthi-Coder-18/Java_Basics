package collections_in_java.generics;

import java.util.Arrays;
import java.util.List;

public class BoundedTypeParameter {

    public static void main(String[] args) {
        System.out.println(boundedType(200, 100));

        System.out.println(add(100, 200));

        Integer[] array = {20,22,56,78,32};
        System.out.println(countGreaterItems(array, 78));

    }

    public static <T extends Comparable<T>> T boundedType(T num1, T num2) {

        if (num1.compareTo(num2) < 0) { // How does this condition works. Not sure until unless we provide an value less than 0 it should be false. But it works fine when used with compareTo() method. 

            return num1;
        }

        return num2;
    }

    // We need to use the BOUNDED TYPES and extend the Generic type with Number in order to sum two generic types [ Float, Double, Integer, Byte, Long, Short]

    public static <T extends Number> Integer add(T num1, T num2 ){
        
        Integer result  = num1.intValue() + num2.intValue(); 
        
        return result;
    }

    // Bounded type for Class object as a parameter!!!

    public static <T extends Number> Integer countGreaterItems(T[] t, T target){

        List<T> arr = Arrays.asList(t);

        Integer result = ((arr.size() - 1) - arr.indexOf(target));

        // Index of an Array starts with 0, but the SIZE of a collection starts from 1. 

        return result;

        
    }

    public <T extends Comparable<T>> int countGreaterItemsSolution(T[] items, T item) {
	    int counter = 0;
	    
	    for (T t : items)
	        if (t.compareTo(item) > 0)
	            ++counter;
	    
	    return counter;
	} 
}



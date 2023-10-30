package fundamentals.basic_concepts;

public class PrimitiveDataTypes {
/*
8 primitive data types in Java

Number -> Integer, Floating-point, character

Integer -> byte,short,int,long [the reason behind of having 4 different integer data types is to use them based on the required size of the data type. Because all the time we do not require an integer to be stored with larger size in the memory.

Floating-point -> float & double

Character -> char


## Local variables will not be having any default values, the instance variables will be having default values even if a value is not assigned to them at the time of declaring.
# if the value assigned to the data type goes of its range, then the compiler will throw an error.

# There are only 2 types of integer literals

1. int literal
2. long literal

// For the above 2 literals, even if we provide underscore symbol in between the literals, still they get printed as a primitive value only.


 */

 //Why do we need to assign the static keyword for the Instance variables to be used inside the Main method of the class?

 // Hexadecimal format starts with 0X || 0x, and it starts and ends from 0to9 & AtoF

 // Check out what is SIGNED TWO COMPLEMENT SCHEME ??

 // Binary format will rarely be used in programming for assigning values to variables.

    public static void main(String[] args) {

        int nav = Integer.MIN_VALUE;
        int kar = Integer.MAX_VALUE;
        System.out.println(kar);
        System.out.println(nav);

    }



}

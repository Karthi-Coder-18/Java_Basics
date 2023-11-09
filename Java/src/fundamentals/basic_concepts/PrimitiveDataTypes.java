package fundamentals.basic_concepts;

import java.math.BigDecimal;

public class PrimitiveDataTypes {
/*
8 primitive data types in Java

Number -> Integer, Floating-point, character

Integer -> byte,short,int,long.The reason behind of having 4 different integer data types is to use them based on the required size of the data type. Because all the time we do not require an integer to be stored with larger size in the memory.

Floating-point -> float & double

Character -> char


## Local variables will not be having any default values, the instance variables will be having default values even if a value is not assigned to them at the time of declaring.
# if the value assigned to the data type goes of its range, then the compiler will throw an error.

# There are only 2 types of integer literals

1. int literal
2. Long literal

// For the above 2 literals, even if we provide underscore symbol in between the literals, still they get printed as a primitive value only.

For Floating data types such as Float and Double, we will need to provide the trailing value F/f || d/D.

For Double the precision is 15 digits, so whenever we provide a long value then the javac will truncate the value into 15 digits and rounds it up to last digit of the value

double value = 4.33333333003339990999999999999; This value will be trimmed down to 15 digits and then rounded to 9 at the end.

Char data type in java will hold only one single character value. And it should be defined inside a single quote.
All the characters in java can also be represented in Uni code format.

char data = '\u0042'; -> This variable value will represent character B in java.

Checkout for Unicode character table on Google. [https://symbl.cc/en/unicode/table/#latin-1-supplement]
 */

 //Why do we need to assign the static keyword for the Instance variables to be used inside the Main method of the class?

 // Hexadecimal format starts with 0X || 0x, and it starts and ends from 0to9 & AtoF

 // Check out what is SIGNED TWO COMPLEMENT SCHEME ??

 // Binary format will rarely be used in programming for assigning values to variables.


 /*
 CHAR datatype in java

 -> A char data type is used to store single character value in java
 -> A char variable in java is internally represented using an unsigned integer scheme,
 [ 0-65535 ] is the range of unsigned integer.
 -> Char literal i.e., data of the char datatype can be initialized using unicode escape sequence, char data, int data 0-65535
 -> When you assign an integer value to a char variable, Java performs an implicit narrowing conversion. This means that Java allows you to assign an integer value to a char variable, but it doesn't automatically convert the integer value into a character.
    Instead, it simply truncates the higher bits of the integer and keeps the lower 16 bits as the character code.
  */


 /*

 BOOLEAN primitive data type is a logical data type that only takes either True or False as literals

 The Default value of boolean datatype is false.

 If we are not initializing a boolean variable, then it gets false as a default value.

 Boolean variables are mostly used in control flow statements.Control flow statements are something that which controls the logic flow based on the condition
 provided to it.






  */

    public static void main(String[] args) {

        //For each and every data type, there will be a range of numbers associated we can call those MIN & MAX values from the data type class itself.
        // Check in the Resources provided regarding internal data representation schemes in java.
        // Java follows the IEEE 754 Standard to store floating-point numbers.
        //https://arshadsuraj.medium.com/java-floating-point-numbers-rounding-problem-solution-a07e019b9dd5 [ check this article for floating data types rounding issue]
        // most of the time the floating data types do not provide the exact value when an action or calculation is performed on them. To tackle that issue, we need to use BIG DECIMAL class.
        // Use Float and Double data types when approximate values are required, if exact values are required either use integer data types or use Big Decimal class.
        int nav = Integer.MIN_VALUE;
        int kar = Integer.MAX_VALUE;
        float king = 50.6F;
        double karthik = Double.MAX_VALUE;
        char single = ' '; // if there is any need of using only a single character in java, use the char datatype.
        char unsigned = 22;
        int literal = '1';
        boolean condition = true; // when using the boolean variable in control flow statements do not use the equality operator
        // if the condition is already used, just use the boolean variable.
        float value = 50.222222222222222222222222220000000000999999999888888f;
        double test = 9.33333333333334444444444002222222222222444445555555555d;
        System.out.println(test);
        System.out.println(value);

       /* for(double a=1.0; a!=0.4 ;a=a-0.1){
            System.out.println(a);
        }*/

        BigDecimal first = new BigDecimal("1.20"); // Big decimal will provide the exact value which is expected when a calculation is performed. 
        BigDecimal second = new BigDecimal("1.0");
        System.out.println(first.add(second));
    }



}

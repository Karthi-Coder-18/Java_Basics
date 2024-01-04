package loops_in_java;

public class TernaryOperator {
    public static void main(String[] ops) {

        String name = "karthik";

        boolean result; 

        
        result = name.equals("Virat") ? true : false; // Here in single line instead of using the traditional IF-ELSE statement we are using ternary operator to execute the code. 

        // The above code traditionally would look like the below code. 

        if(name.equals("king")){
            result = true;
        }else {
            result = false;
        }

        System.out.println(result + " k");

    }
}





/* 
 * If there is a need of writing if-else conditional statement in single or few multiple lines then use TERNARY OPERATOR. 
 * Syntax:  ?: 
 * 
 * The comtent before question mark is IF statement, after the question mark would be the statement we place inside the brackets. 
 * Content after colon would be else statement and it's result statement. 
 */









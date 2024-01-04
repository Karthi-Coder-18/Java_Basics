package practice_questions;

public class SwitchCase {

    public static void main(String[] args) {

        String name = "data";

        switch(name){
            case "Karthik" : 
                 System.out.println(18);
                 break;
            case "MSD" : 
                 System.out.println(07);
                 break;
            case "Game" : 
                System.out.println(300);
            default : System.out.println("nothing");
        }
    }
}



/* 
 * if there are set of values and if we would like to print different statements for each value based on the input provided then use SWITCH CASE concept. 
 * 
 * When the SWITCH block matches the corrcet case if executes the value and then it goes on to complete all the cases after the condition. 
 * 
 * In order to stop it from happening use BREAK keyword so that once the condition is matched with SWITCH block then it will break the cases and comes out of it. 
 * 
 * 
 * BREAK : This is a special keyword in java used to come out of a loop or switch case block and also can be used in different concepts of java. 
 * 
 * DEFAULT is a type of case present inside the SWITCH block which will gets executed if any of the case doesn't matches with the variable provided. 
 * 
 * 
 * 
 */







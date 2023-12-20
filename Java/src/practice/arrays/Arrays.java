package practice.arrays;

public class Arrays {

    public static void main(String[] args) {

       


        int[] num = new int[5]; // When array is declared and the elements are yet to be initilized the default value of all the variables inside the DYNAMIC array would be 0.
        num[0] = 100;
        num[1] = 100;
        num[2] = 100;
        num[3] = 100;
        num[4] = 100;

        // To print all the elements inside an array use for or for each loop. Both does the same operation, i.e. looping through each and every element of the provided array using index value. 

        for (int i : num) {
            System.out.println(i);
        }

        for(int i=0; i<num.length; i++){
            System.out.println(num[i]);
        }

        int sum = num[0] + num[1] + num[2] + num[3];
        String[] players = {"Lara's", "Naveen"};
        players[0] = "Virat Kohli"; // To update an value inside a exisiting array use the index position of the element. 

        System.out.println("Sum is: " + sum);
        System.out.println(players[0] + " highest individual score in TEST format is " + sum);


         Cricketer batters[] = new Cricketer[3]; // Here we are not creating 3 Objects, we are creating an ARRAY which is capable of holding 3 OBJECTS. 
         // It is our responsibility to instantiate the Objects inside the arrays manually. 

       /*   batters[0] = new Cricketer();
         batters[1] = new Cricketer();
         batters[2] = new Cricketer();

         batters[0].name = "Virat Kohli";
         batters[0].runs = 973;  */

         // Above is one way of creating an Array of objects and assigning values to the instance variables of the object. 

         Cricketer virat = new Cricketer();
         Cricketer dhoni = new Cricketer();
         Cricketer rohit = new Cricketer();

         virat.average = 53.04;
         virat.runs = 973; 
         virat.player = "King Kohli";

         dhoni.team = "CSK";
         dhoni.runs = 500;
         dhoni.player = "MSD";


         rohit.tournament = "IPL";
         rohit.average = 50.11;
         rohit.runs = 600;
         rohit.player = "HITMAN";



         batters[0] = virat;
         batters[1] = dhoni;
         batters[2] = rohit; // This is another way of creating Array of objects and assigning values one of the benefits is that we can access values of the variables during loop easily, 


         for(int i=0; i<batters.length;i++){
            System.out.println(batters[i].player + " : " + batters[i].runs);
         }

         // ENHANCED FOR LOOP for array of objects. 
         // Instead of using any of the data type use the CLASS name for requesting the values from the actual array being provided and store it inside the reference variable. 
         for(Cricketer athelete : batters){
            System.out.println(athelete.player);
         }





    }

    
    

}









































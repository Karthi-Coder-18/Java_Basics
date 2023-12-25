package collections_in_java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


public class CollectionsInJava {
    public static void main(String[] a) {

        // LIST IN COLLECTION

        List<Integer> num = new ArrayList<Integer>();

        num.add(183);
        num.add(122);
        num.add(254);
        num.add(115); // To add a value into an ArrayList use add() method. 

        num.get(0);
        for (int i : num) {
            System.out.println(i);
        } // This will loop through every value inside the Arraylist using indexing concept. 

        System.out.println(num); // If there is no need of looping through every value inside the list then we can just print the ArrayList values which in turn provides the data addded inside the List. 

        System.out.println(num.get(2)); // LIST provides a GET method to use the index values of the data inside the ArrayList.


        Collection<Integer> bear = new ArrayList<Integer>();

        bear.add(200);

       



        //SET IN COLLECTION 

        Set <String> tennisPlayers = new TreeSet<String>(); // If there is a need of adding Unique values then use SET  


        tennisPlayers.add("Nadal");
        tennisPlayers.add("Federer");
        tennisPlayers.add("Djokovic");
        tennisPlayers.add("Djokovic"); //SET does not allow duplicate values in java. 

    
        for(String s : tennisPlayers){
            System.out.println(s);
        }





        //ITERATOR [This class is being Extended by Iterable interface]

        java.util.Iterator<String> values = tennisPlayers.iterator();


        while (values.hasNext()) {
            System.out.println(values.next());
        }


        // MAP IN COLLECTIONS CONCEPT 

        Map<Integer,String> batsmen = new HashMap<Integer,String>();


        batsmen.put(18, "Virat Kohli");
        batsmen.put(10, "Sachin Tendulkar");
        batsmen.put(7, "MS Dhoni");
        batsmen.put(17, "AB Devilliers");

        System.out.println(batsmen);

        //To loop through every value inside the map 

        for(Integer key : batsmen.keySet()){
            System.out.println(batsmen.get(key));
        }

                                        
    }
}

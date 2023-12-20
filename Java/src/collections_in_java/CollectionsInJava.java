package collections_in_java;

import java.util.ArrayList;
import java.util.List;

public class CollectionsInJava {
    public static void main(String[] a) {

        List<Integer> num = new ArrayList<Integer>();

        num.add(183);
        num.add(122);
        num.add(254);
        num.add(115);

        for(int i : num){
            System.out.println(i);
        }

        
        System.out.println(num);

    }
}

package collections_in_java.generics.generics_excersie_problems;

public class Excersie {
    public static void main(String[] args){

        Library<Algorithm> data = new Library<>();

        data.add(new SearchAlgorithm());
        data.add(new SortAlgorithm());
        data.add(new GraphAlgorithm());

        Algorithm item = data.lastItem();

        while(item != null){
            item.execute();
            item = data.lastItem();
        }
    }
}

package collections_in_java.generics.generics_excersie_problems;

import java.util.ArrayList;
import java.util.List;

public class Library<T extends Algorithm> {

    private List<T> algorithms;

    public Library() {
        this.algorithms = new ArrayList<>();
    }

    public void add(T algorithm) {
        this.algorithms.add(algorithm);
    }

    public T lastItem() {
        if (algorithms.size() <= 0)
            return null;

        T acutalItem = algorithms.remove(algorithms.size() - 1);
        return acutalItem;
    }

}

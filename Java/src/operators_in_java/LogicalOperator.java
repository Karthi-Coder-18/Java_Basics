package operators_in_java;

public class LogicalOperator {

    public static void main(String[] args) {


        int a = 20;
        int b = 40;

        boolean k = a > b;
        boolean h = b < 100;
        boolean i = !(a < b);

        System.out.println(k && h); // AND the operator will return TRUE only if both conditions are satisfied.
        System.out.println(k || h); // OR operator will return TRUE as boolean value if any of the conditions gets satisfied
        System.out.println(i); // NOT operator returns the inverse of condition statement result.

    }

}

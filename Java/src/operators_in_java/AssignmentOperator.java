package operators_in_java;

public class AssignmentOperator {
    public static void main(String[] args) {

        int salary = 20000;
        int promo = 5000; // if any value needs to be assigned to any variables, we can use assignment operator to assign the values[=]

        //salary = salary + promo;
        salary += promo;
        System.out.println(salary);

        // Example 2
        int num = 2;
        int multiplier = 5;

      //  practice.AbstractClass class = new practice.AbstractClass(); Objects cannot be created for a class which is used with Abstract as a keyword.
        //num = num * multiplier;
        num *= multiplier;
        System.out.println(num);
    }
}

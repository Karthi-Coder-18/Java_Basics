package practice;

public class ClassAndObjects {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();// Object creation syntax in java. Here R1 can be called as instance variable
        r1.setLength(10);
        r1.setBreadth(20); // use dot operator to access the methods and variables of a specific class using the instance variable.


        Rectangle r2 = r1;
        r2.setLength(50);
        r2.setBreadth(100);

        Rectangle r3 = new Rectangle();
        Rectangle r4 = new Rectangle();
        Rectangle r5 = new Rectangle();

        System.out.println(r1.getBreadth());
        System.out.println(r1.getLength());
    }

}


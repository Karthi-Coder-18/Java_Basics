public class Example {
    public static void main(String[] args) {

        Thread t = Thread.currentThread();
        System.out.println(t);

        int k = calcArea(10, 10);
        calcArea(100, 10);
        long h = 42;
       // int f = calcArea(h, 17); if we provide a different data type as argument instead of the actual one provided during parameter creation it doesn't work. 

       // byte o = calcArea(10, 22); 
        System.out.println(k);

    }

    public static int calcArea(int num1, int num2) {
        return num1 * num2;
    }

}

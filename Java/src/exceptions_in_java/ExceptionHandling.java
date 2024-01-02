package exceptions_in_java;

public class ExceptionHandling  {

    public static void main(String[] args) {

       // int[] num = {100, 300, 200};
        int[] data = new int[3];
        data[0] = 1000;

       // setField();

        try {
            int result = data[4]; // Here an array can only have 4 int values, but we are trying to access the 5th value which throws ArrayIndexOutOfBoundsException
            System.out.println(result);
        } catch (ArrayIndexOutOfBoundsException exception) {

            System.out.println("Karthik"); // To handle the exception, we are printing this string value.
        }finally {
            assert System.out != null;
            System.out.println("King");
        }


        try{
            String value = null;
            System.out.println(value.length()); // this should throw an nullPointerException as the string variable does only have null value
        }catch(Exception exception){ // General way to handle exceptions. Write the exception which may occur inside the catch as parameter and then write the alternative solution to tackle the exception.
            assert System.out != null;
            System.out.println("exception");
        }

    }

}

package exceptions_in_java;

public class Examples {
    public static void main(String[] args) {
        int i = 0;

        int j = 0;

        try{
            j = 18/i;
            if(j==0)
            throw new KarthikException("Custom Exception");
        }catch(KarthikException e){
            j = 18/1;
            System.out.println("Karthi ");
        }
    }
}

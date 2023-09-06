package practice.loops;

public class CompileErrors {

    public static void main(String[] args) {

        int x = 5;

        CompileErrors compileErrors = new CompileErrors();

        compileErrors.exercise1();
        compileErrors.exercise2();


        while (x > 1) {

            x = x - 1;

            if (x < 3) {
                System.out.println(" ok ");
            }

        }


    }

    // Static: means that the method belongs to the Main class and not an object of the Main class

    // If there is a need of calling a method inside the same class which isn't STATIC, then create an object of the class inside the Main method and call the respective method.

    // The loops run on the basis of conditions provided, if the condition is satisfied, then it executes the statements inside the loop until the condition is false.
    public void exercise1() {

        int x = 1;

        while (x < 10) {

            x = x + 1;

            if (x > 3) {
                System.out.println(" king ");
            }
        }
    }


    public void exercise2(){
        int x = 5;

        while(x > 1) {
            x = x - 1;
            if(x < 3){
                System.out.println("Sai");
            }
        }
    }

}

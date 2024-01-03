package lambda_expression_in_java;

@FunctionalInterface
 interface FunInterface {
    void play();
    //void king();
}


@FunctionalInterface
 interface FootBall {
    void player(String name);
    //void king();
}

@FunctionalInterface
interface ReturnValues{
  int square(int x);
}

public class Demo{
    public static void main(String[] args) {
        
      FunInterface f = () ->  System.out.println("Cricket"); // -> This lambda expression defines ==> new FunInterface() { public void play }
      f.play();
    
      FootBall b = (String name) -> {
            System.out.println("The GOAT of football" + name);
        };
      b.player("Messi");




      // Returning the value using Lambda expression in java 

      ReturnValues rr = (x) -> x * x; // If we have only one line of code & it's only usecase is to return the values then there is no need of using the RETURN keyword when lambda expression is used. 
        
     int result =  rr.square(10);
     System.out.println(result);


    }
};
    


















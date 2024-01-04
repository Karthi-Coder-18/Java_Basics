package inner_class_in_java;

public interface Fruits {
    
    void fruitName();

}

class Example{

public static void main(String[] args){
    Fruits f = new Fruits() {

        @Override
        public void fruitName() {
            System.out.println("Apples");
          //  throw new UnsupportedOperationException("Unimplemented method 'fruitName'");
        }
        
        
    };
    f.fruitName();
}


}

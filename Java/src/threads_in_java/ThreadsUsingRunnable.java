package threads_in_java;

/* class demo1 implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Lionel");
            try {
                Thread.sleep(5);
            } catch (InterruptedException exception) {
                System.out.println("waste of time");
            }
        }
    }
} */

/* class demo2 implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Messi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException exception) {
                System.out.println("Cool!!");
            }
        }
    }
}
 */
public class ThreadsUsingRunnable {
    public static void main(String[] args) {

        // Instead of creating a seperate class to implement an Functional Interface,
        // while creating an Object create an Anonymous class and Override the method
        // inside the interface.

        Runnable game = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Lionel");
                try {
                    Thread.sleep(5);
                } catch (InterruptedException exception) {
                    System.out.println("waste of time");
                }
            }
        };
        Runnable engine = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Messi");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException exception) {
                    System.out.println("Cool!!");
                }
            }

        };

        Thread t1 = new Thread(game); // The reason why we are passing the objects here is that one of the
                                      // constructors in Thread class do has Runnable Object as a parameter.
        Thread t2 = new Thread(engine);

        t1.start();
        t2.start();
    }

}

package threads_in_java;

class test extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("karthik");
            try {
                Thread.sleep(5);
            } catch (InterruptedException exception) {
                System.out.println("waste of time");
            }
        }
    }
}



class test2 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("kohli18");
            try{
                Thread.sleep(10);
            }catch(InterruptedException exception){
                System.out.println("Cool!!");
            }
        }
    }
}



public class ThreadsInJava {
    public static void main(String[] args) {

        test d = new test();
        test2 d2 = new test2();

        d.start();
        d2.start();

    }
}

// Why does the run() method cannot return an array of elements? if there is any
// need how to achieve it?

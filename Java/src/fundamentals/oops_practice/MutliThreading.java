package oops_practice;

public class MutliThreading implements Runnable {


    public static void main(String[] args){
        MutliThreading t = new MutliThreading();
        Thread t1 = new Thread(t);
        t1.start();
    }

/*    @Override
    public void run() {
        super.run();
        System.out.println("Thread is running");
    }*/

    @Override
    public void run() {
        System.out.println("Karthik");
    }
}

/*
https://www.javatpoint.com/how-to-create-a-thread-in-java
Multithreading is a process of executing multiple threads simultaneously.
Multithreading is used over Multiprocessing cause threads use shared memory area, they do not allocate separate memory area so saves memory

Threads are independent, so they don't affect each other if any exception occurs. We can perform multiple operations together. So saves the time.

Threads in java are The Smallest Unit of Processing

There can be multiple processes running inside OS, and one process can have multiple threads.

Thread class extends Object and implements Runnable interface.

start(),run(),sleep()


We can achieve threading in java by extending the Thread class or by implementing Runnable interface. In the case of interface, we need to create an object of thread class and pass the class actual class reference variable as parameter.
 */


















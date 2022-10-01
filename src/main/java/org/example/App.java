package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener errorListener = System.out::println;

        Worker worker = new Worker(listener, errorListener);
        worker.start();

    }
}

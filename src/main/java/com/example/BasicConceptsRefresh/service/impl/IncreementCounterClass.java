package com.example.BasicConceptsRefresh.service.impl;

/**
 * For using and implementing threads and multithreaded environments
 * Also show use of synchronized and join methods for threads
 */
public class IncreementCounterClass implements Runnable {
    private static int counter = 0; //to share between the threads
    private static final  int MAX_COUNT = 20;

    @Override
    public void run() {
        while(true){
        synchronized (IncreementCounterClass.class){

            if(counter >= MAX_COUNT) {
                break;
            }
        counter++;
        System.out.println(Thread.currentThread().getName() + " increemented the counter to: " +counter);
    } }}

    public static void main(String[] args) {
        IncreementCounterClass increementCounter = new IncreementCounterClass();

        Thread t1 = new Thread(increementCounter,"thread1");
        Thread t2 = new Thread(increementCounter,"thread2");
        Thread t3 = new Thread(increementCounter,"thread3");

        t1.start();
        t2.start();
        t3.start();

        try{
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All executions have completed.");
    }
}

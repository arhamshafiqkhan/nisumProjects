package com.arham.mymultithreading;

public class Main {
    public static void main(String[] args) {

        MyThread thread1 = new MyThread("Thread 1");
        thread1.start();

        MyThread thread2 = new MyThread("Thread 2");
        thread2.start();

        // as soon as both threads get closed, it will break out of while loop
        while(true) {
            if (!(thread1.isAlive() && thread2.isAlive()))
                break;
        }
        System.out.println("Exiting main thread.");
    }
}

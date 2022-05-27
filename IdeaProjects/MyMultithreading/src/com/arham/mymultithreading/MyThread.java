package com.arham.mymultithreading;

public class MyThread extends Thread {
    String name;
    public MyThread(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println(this.name + " has started.");
        for (int i = 3; i > 0; i--) {
            System.out.println(this.name + " : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Exiting " + this.name);
    }
}

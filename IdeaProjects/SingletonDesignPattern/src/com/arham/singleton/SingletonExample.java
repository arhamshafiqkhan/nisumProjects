package com.arham.singleton;

public class SingletonExample {
    private static SingletonExample singletonObject;

    private SingletonExample() {
        // private constructor to avoid creating objects outside the class
    }

    public static SingletonExample getInstance() {
        if (singletonObject == null)
            singletonObject = new SingletonExample(); // instantiating here
        return singletonObject;
    }

    protected void checkSingleton() {
        System.out.printf("Hash code of singleton object is : %s%n", singletonObject.hashCode());
    }
}

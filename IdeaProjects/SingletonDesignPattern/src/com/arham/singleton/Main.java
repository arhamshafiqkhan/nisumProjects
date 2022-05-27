package com.arham.singleton;

public class Main {
    public static void main(String[] args) {
        SingletonExample obj1; // can't instantiate here since the constructor is private
        obj1 = SingletonExample.getInstance(); // invoking public method to instantiate object
        obj1.checkSingleton(); // getting hashcode of the object

        SingletonExample obj2;
        obj2 = SingletonExample.getInstance();
        obj2.checkSingleton();

        System.out.println(obj1 == obj2);
    }
}

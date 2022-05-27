package com.arham.langpackage;

import com.arham.langpackage.PrimeNumbers;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Task # 1 (String literals vs objects)
        String str1 = "Arham Shafiq"; // string literal
        String str2 = new String("Arham Shafiq"); // string object
        String str3 = "Arham Shafiq";

        System.out.println(str1 == str3); // comparing string literals using '==' (we can do that in case of literals)

        // the following statement will produce 'false' due to wrong syntax
        System.out.println(str1 == str2); // comparing string literal with a string object using '==' (wrong way of comparing)

        // the following statement yields 'true' since we've used the correct syntax for comparing a string object
        System.out.println(str1.equals(str2));

        System.out.println();

        // Task # 2 (comparing using toCompare() -> unicode value comparison. returns 0 if equal, otherwise >0 or <0)
        String str4 = "arham";
        System.out.println(str1.compareTo(str2) == 0);

        System.out.println(str1.compareTo(str4) == 0);

        System.out.println();

        // Task # 3 (StringBuilder vs StringBuffer class)
        StringBuffer stringBuffer = new StringBuffer("Java is an Object Oriented Language");
        StringBuilder stringBuilder = new StringBuilder("Java is an Object Oriented Language");

        //long start1 = System.currentTimeMillis();
        long start1 = System.nanoTime();
        for (int i = 0; i < stringBuffer.length(); i++) {
            System.out.print(stringBuffer.charAt(i));
        }
        //long end1 = System.currentTimeMillis();
        long end1 = System.nanoTime();
        long total_time1 = end1 - start1;
        System.out.println();
        System.out.println("Time taken to traverse string buffer object is " + total_time1 + " " + start1 + " " + end1);

        System.out.println();

        //long start2 = System.currentTimeMillis(); // milliseconds
        long start2 = System.nanoTime(); // nanoseconds
        for (int i = 0; i < stringBuilder.length(); i++) {
            System.out.print(stringBuilder.charAt(i));
        }
        //long end2 = System.currentTimeMillis();
        long end2 = System.nanoTime();
        long total_time2 = end2 - start2;
        System.out.println();
        System.out.println("Time taken to traverse string builder object is " + total_time2 + " " + start2 + " " + end2);

        System.out.println();

        if (total_time1 < total_time2)
            System.out.println("String Buffer is faster.");
        else if (total_time2 < total_time1)
            System.out.println("String Builder is faster.");
        else
            System.out.println("Both have same performance.");

        System.out.println();

        // Task # 4 (string to CAPITAL letters)
        System.out.println(str1.toUpperCase());
        System.out.println();

        // Task # 5 (Prime numbers count)
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive interger: ");
        int number = input.nextInt();
        System.out.println();
        int primeCount = PrimeNumbers.primeNumbers(number);
        System.out.println("The number of prime numbers less than " + number + " is/are : " + primeCount);
    }
}

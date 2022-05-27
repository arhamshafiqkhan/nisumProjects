package com.arham.mycollections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(21);
        numbers.add(-10);
        numbers.add(53);
        numbers.add(6);
        numbers.add(33);
        numbers.add(7);
        numbers.add(19);
        // sorting list
        Collections.sort(numbers);

        Scanner input = new Scanner(System.in);
        System.out.print("Which item would you to search? ");
        int key = input.nextInt();

        long start1 = System.nanoTime();
        MySearch.mySearchMethod(numbers, key);
        long end1 = System.nanoTime();
        long searchTimeUsingMySearch = end1 - start1;

        // using Built-in binary search
        long start2 = System.nanoTime();
        int index = Collections.binarySearch(numbers, key);
        System.out.println("*** Searching item using Binary search ***");
        if (index < 0)
            System.out.println("Item is not present in the list.");
        else
            System.out.println("Item " + key + " is present at index " + index);
        long end2 = System.nanoTime();
        long searchTimeUsingBinarySearch = end2 - start2;

        System.out.println("The time taken by MySearch method is " + searchTimeUsingMySearch + " nanoseconds");
        System.out.println("The time taken by built-in Binary search method is " + searchTimeUsingBinarySearch + " nanoseconds");
    }
}

package com.arham.arraylistvslinkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        for (int i = 1; i <= 1000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long start1 = System.nanoTime();
//        boolean isLastItemAL = arrayList.contains(arrayList.get(arrayList.size() - 1));
//        boolean isItemAL = arrayList.contains(500); // in .contains(), arrayList is slower

//        int arrayLastItem = arrayList.get(arrayList.size() - 1); // getting last item in arrayList

        int indexArrayLastItem = Collections.binarySearch(arrayList, 500); // searching using binary search
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
//        boolean isLastItemLL = linkedList.contains(linkedList.get(linkedList.size() - 1));
//        boolean isItemLL = linkedList.contains(500); // in .contains(), linkedList is faster

//        int linkedLastItem = linkedList.get(linkedList.size() - 1); // getting the last item in linkedList via index
//        int linkedLastItem = linkedList.getLast(); // using .getLast(), linkedList is faster than ArrayList

        int indexLinkedLastItem = Collections.binarySearch(linkedList, 500); // searching using binary search
        long end2 = System.nanoTime();

        System.out.println("Time taken to search the last item in ArrayList is " + (end1 - start1));

        System.out.println("Time taken to search the last item in LinkedList is " + (end2 - start2));

     }
}

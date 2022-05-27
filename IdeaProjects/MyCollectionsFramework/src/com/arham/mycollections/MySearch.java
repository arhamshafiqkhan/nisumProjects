package com.arham.mycollections;

import java.util.List;

public class MySearch {
    public static void mySearchMethod(List list, int key) {

        System.out.println("*** Searching item using MySearch ***");

        int i = 0;
        for (i = 0; i < list.size(); i++) {
            if (list.get(i).equals(key)) {
                System.out.println("The item " + key + " is at index : " + i);
                break;
            }
        }
        if (i >= list.size())
            System.out.println("Item is not present in the list");
    }
}

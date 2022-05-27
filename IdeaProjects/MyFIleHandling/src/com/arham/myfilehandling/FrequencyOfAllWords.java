package com.arham.myfilehandling;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfAllWords {
    public static void main(String[] args) {
        // use hasMap to store key, value pairs where key contains word and its value contains the no. of occurrence of the word
        // <key, value> ==> <String, Integer>

        HashMap<String, Integer> map = new HashMap<>();
        Scanner file = null;
        try {
            file = new Scanner(new File("/Users/ashafiq/Documents/fileOccurrence.txt"));
            while (file.hasNext()) {
                String word = file.next().toLowerCase();
                Integer count = map.get(word); // key = word (String), .get() method returns value which is an Integer in our map.
                if (count != null) // since count is of type Integer (wrapper class), and not primitive int
                    count++;
                else
                    count = 1;
                map.put(word, count);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (file != null)
                file.close();
        }

        for (Map.Entry<String, Integer> entry : map.entrySet())
            System.out.println(entry.getKey() + " has occurred " + entry.getValue() + " time(s).");
    }
}
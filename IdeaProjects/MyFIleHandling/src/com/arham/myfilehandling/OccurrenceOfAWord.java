package com.arham.myfilehandling;
import javax.security.auth.login.AccountLockedException;
import java.io.*;
import java.util.Scanner;

public class OccurrenceOfAWord {
    public static void main(String[] args) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("What word would you like to search for? ");
        String searchFor = input.nextLine();

        try {
            fileReader = new FileReader("/Users/ashafiq/Documents/fileOccurrence.txt");
            bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();
            while (line != null) {
                String [] words = line.split(" ");
                for (String word : words) {
                    if (searchFor.equalsIgnoreCase(word)) {
                        count++;
                    }
                }
                line = bufferedReader.readLine();
            }
            if (count != 0)
                System.out.println("The frequency of the word " + searchFor + " in the text file is: " + count);
            else
                System.out.println("The searched word doesn't exist in the current file.");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fileReader != null)
                    fileReader.close();
                if (bufferedReader != null)
                    bufferedReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
        }
    }
}

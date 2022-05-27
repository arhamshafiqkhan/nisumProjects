package com.arham.myfilehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCreateWrite {
    public static void main(String[] args) {

        // Assignment # 1
        FileWriter myFile = null;
        BufferedWriter bufferedWriter = null;
        Scanner input = new Scanner(System.in);
//        Scanner userInput = new Scanner(System.in);
        String userInput;
        try {
            myFile = new FileWriter("/Users/ashafiq/Documents/myFile.txt");
            bufferedWriter = new BufferedWriter(myFile);
            System.out.println("Write some data into your file: ");
            do {
                bufferedWriter.write("\n");
                bufferedWriter.write(input.nextLine());
                System.out.println("Would you like to add more lines: yes/no? ");
                userInput = input.nextLine();
            } while (userInput.equalsIgnoreCase("yes"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
                    try {
                        if (bufferedWriter != null) {
                            bufferedWriter.close();
                        }
                        if (myFile != null) {
                            myFile.close();
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
        }
    }
}

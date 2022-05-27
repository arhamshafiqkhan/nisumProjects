package com.arham.myfilehandling;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

public class ListOfAllFiles {
    public static void main(String[] args) {
        // Assignment # 2
        File directory = new File("/Users/ashafiq/Documents");
        File[] listOfFiles = directory.listFiles();
        if (listOfFiles != null) {
            System.out.println("List of all files present in the Documents directory: ");
            for (File file : listOfFiles) {
                if(file.isFile())
                    System.out.println("File name: " + file.getName());
            }
        }
        else
            System.out.println("No files present in the searched directory.");

        // Assignment # 3
        Scanner input = new Scanner(System.in);
        System.out.println("What file format would you like to search? ");
        String fileFormat = input.nextLine();

        File[] filesWithExtension = directory.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.toLowerCase().endsWith(fileFormat.toLowerCase());
            }
        });
        System.out.println("List of files with .txt present in the Documents directory: ");
        if (filesWithExtension != null) {
            for (File file : filesWithExtension)
                if (file != null)
                    System.out.println("File name: " + file.getName());
        }

    }
}
package com.arham.myfilehandling;

import java.io.*;

public class CopyFileContents {
    public static void main(String[] args) {

        FileReader fileReader = null;
        FileWriter fileWriter = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileReader = new FileReader("/Users/ashafiq/Documents/file1.txt");
            fileWriter = new FileWriter("/Users/ashafiq/Documents/copiedFile.txt");
            bufferedReader = new BufferedReader(fileReader);
            bufferedWriter = new BufferedWriter(fileWriter);

            String line = bufferedReader.readLine();
            while (line != null) {
                bufferedWriter.write(line + "\n");
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
                try {
                    if (bufferedReader != null)
                        bufferedReader.close();
                    if (bufferedWriter != null)
                        bufferedWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
        }
    }
}


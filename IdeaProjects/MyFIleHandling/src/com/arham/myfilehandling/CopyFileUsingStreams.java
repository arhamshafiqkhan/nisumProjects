package com.arham.myfilehandling;

import java.io.*;
import java.util.Objects;

public class CopyFileUsingStreams {
    public static void main(String[] args) {

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try{
            fileInputStream = new FileInputStream("/Users/ashafiq/Documents/file1.txt");
            fileOutputStream = new FileOutputStream("/Users/ashafiq/Documents/copiedFileStream.txt");
            int byteValue;
            while((byteValue = fileInputStream.read()) != -1)
                fileOutputStream.write(byteValue);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (Objects.nonNull(fileInputStream)) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyBytes {
    public static void main(String[] args) throws IOException {

        String path = "C:\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);

        Scanner scanner = new Scanner(inputStream);

        FileOutputStream fileOutputStream = new FileOutputStream("output.txt");

        int nextByte = inputStream.read();

        while (nextByte != -1) {

            if (nextByte == ' ' || nextByte == '\n'){
                fileOutputStream.write(nextByte);
            } else {

                fileOutputStream.write(String.valueOf(nextByte).getBytes());
            }
            nextByte = inputStream.read();
        }

        fileOutputStream.close();
    }
}

package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class E2 {
    public static void main(String[] args) throws IOException {
        Path pathFile = Path.of("C:\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");

        long sum = 0;

        for (byte value : Files.readAllBytes(pathFile)) {
            if (value == 10 || value ==13){
                continue;
            }
            sum += value;
        }


        System.out.println(sum);


    }
}

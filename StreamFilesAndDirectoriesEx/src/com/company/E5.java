package com.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class E5 {
    public static void main(String[] args) throws IOException {
        Path pathFile = Path.of("C:\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt");

        List<String> lines = Files.readAllLines(pathFile);

        PrintWriter writer = new PrintWriter("outputLines.txt");
        int row = 1;
        for (String line : lines){
           writer.println(row++ + ". " + line);
        }
        writer.close();
    }
}

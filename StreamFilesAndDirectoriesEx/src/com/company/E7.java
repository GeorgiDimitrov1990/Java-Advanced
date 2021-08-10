package com.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class E7 {
    public static void main(String[] args) throws IOException {
        Path firstPath = Path.of("C:\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt");
        Path secondPath = Path.of("C:\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt");

        List<String> linesFirst = Files.readAllLines(firstPath);
        List<String> linesSecond = Files.readAllLines(secondPath);

        PrintWriter writer = new PrintWriter("merge.txt");

        linesFirst.forEach(line -> writer.println(line));
        linesSecond.forEach(line -> writer.println(line));

        writer.close();
    }
}

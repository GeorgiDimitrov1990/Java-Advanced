package com.company;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class E3 {
    public static void main(String[] args) throws IOException {

        Path pathFile = Path.of("C:\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");
        Path outputPathFile = Path.of("C:\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt");

        List<String> lines = Files.readAllLines(pathFile);
        File outputFile = new File("C:\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt");
        PrintWriter writer = new PrintWriter(outputFile);

        lines.forEach(line -> writer.println(line.toUpperCase()));

        writer.close();
    }
}

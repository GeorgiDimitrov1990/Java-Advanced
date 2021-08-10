package com.company;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class E3otherWay {
    public static void main(String[] args) throws IOException {

        Path pathFile = Path.of("C:\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");
        Path outputPathFile = Path.of("C:\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt");

        List<String> lines = Files.readAllLines(pathFile);
        File outputFile = new File("C:\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

        lines.forEach(line -> {
            try {
                writer.write(line.toUpperCase());
                writer.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        writer.close();
    }
}
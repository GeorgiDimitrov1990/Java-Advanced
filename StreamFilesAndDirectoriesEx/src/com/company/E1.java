package com.company;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;

public class  E1 {
    public static void main(String[] args) throws IOException {
        String path = "output.txt";
        File file = new File(path);
        file.createNewFile();


        PrintWriter writer = new PrintWriter(file);
        writer.println("Java Advanced");
        writer.println("First time working with Writer");

        writer.close();


    }
}

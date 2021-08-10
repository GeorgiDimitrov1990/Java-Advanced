package com.company;

import java.io.File;
import java.io.IOException;

public class Demo4 {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");

        File[] files = file.listFiles();

        for (File f : files) {
            if (!f.isDirectory()){
                System.out.println(f.length());
            }
        }

    }
}

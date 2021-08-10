package com.company;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class E8 {
    public static void main(String[] args) {
       String path = "C:\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";

        File folder = new File(path);
        long size = 0;
        for (File file : folder.listFiles()) {
            size +=file.length();
        }
        System.out.println("Folder size: " + size);




    }
}

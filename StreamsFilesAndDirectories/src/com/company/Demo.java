package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String path = "C:\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);

        int read = inputStream.read();

        while (read != -1){
            System.out.print(Character.toChars(read));
            read = inputStream.read();
        }


    }
}

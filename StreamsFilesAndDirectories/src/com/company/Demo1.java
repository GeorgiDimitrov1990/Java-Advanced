package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            example();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Try catch block finished");
        }

    }
    public static void example() throws IOException {
        throw new IOException("I am exception in an empty method");
    }
}

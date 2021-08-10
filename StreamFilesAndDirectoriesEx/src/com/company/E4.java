package com.company;

import java.io.*;
import java.nio.file.Path;

public class E4 {
    public static void main(String[] args) throws IOException {
        String pathFile = "C:\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        int countVowels = 0;
        int countConsonants = 0;
        int countPunctuation = 0;
        String vowels = "aeiou";
        String punctuation = "!,.?";

        BufferedReader reader = new BufferedReader(new FileReader(pathFile));
        String line = reader.readLine();
        while (line != null){

            String[] words = line.split("\\s+");
            for (String word : words){
                for (char symbol : word.toCharArray()){
                    if (vowels.contains(String.valueOf(symbol))){
                        countVowels++;
                    } else if (punctuation.contains(String.valueOf(symbol))){
                        countPunctuation++;
                    } else {
                        countConsonants++;
                    }
                }
            }


            line = reader.readLine();
        }

        reader.close();
        PrintWriter writer = new PrintWriter("outputCount.txt");
        writer.println("Vowels: " + countVowels);
        writer.println("Consonants: " + countConsonants);
        writer.println("Punctuation: " + countPunctuation);
        writer.close();
    }
}

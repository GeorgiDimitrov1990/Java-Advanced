package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Demo6 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(14);
        numbers.add(15);
        numbers.add(16);

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("list.txt"));

        out.writeObject(numbers);

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("list.txt"));

        List<Integer> readedList =(List<Integer>) in.readObject();

        for (Integer integer : readedList) {
            System.out.println(integer);
        }

    }
}

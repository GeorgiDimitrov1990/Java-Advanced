package com.company;

import java.awt.*;
import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
        Jar<Integer> jarOne = new Jar<>();
        Jar<String> jarTwo = new Jar<>();


        Scale<Person> scale = new Scale<Person>(new Person(80), new Person(50));






        jarOne.add(13);
        jarTwo.add("Pesho");
        String[] elements = create(12, "element");

        Integer[] numbers = create(13, 13);
    }



    public static <T> T[] create(int length, T element){

        Object arr = Array.newInstance(element.getClass(), length);
        return (T[])arr;
    }

    public static <T> T[] create(Class<T> clazz, int length, T item){
        return  (T[])Array.newInstance(clazz, length);
    }
}

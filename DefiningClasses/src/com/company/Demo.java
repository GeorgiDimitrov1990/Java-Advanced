package com.company;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");

            Car car;

            if (tokens.length == 1) {
                car = new Car(tokens[0]);
            } else if (tokens.length == 2) {
                car = new Car(tokens[0], tokens[1]);
            } else {
                car = new Car(tokens[0], tokens[1], Integer.parseInt(tokens[2]));
            }
            System.out.println(car.carInfo());

        }




    }
}

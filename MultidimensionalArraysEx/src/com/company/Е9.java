package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Е9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] data = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        boolean[][] isOccupied = new boolean[data[0]][data[1]];
        for (int row = 0; row < isOccupied.length; row++) {
            isOccupied[row][0] = true;
        }

        String input = scanner.nextLine();
        while (!input.equals("stop")){

            String[] tokens = input.split(" ");
            int entryRow = Integer.parseInt(tokens[0]);
            int targetRow = Integer.parseInt(tokens[1]);
            int targetCol = Integer.parseInt(tokens[2]);

            boolean hasFoundFreePlace = false;

            int traveledDistance = 1;
            traveledDistance += Math.abs(targetRow - entryRow);

            if (!isOccupied[targetRow][targetCol]){
                traveledDistance += targetCol;
                isOccupied[targetRow][targetCol] = true;
                hasFoundFreePlace = true;
            } else {
                for (int i = 1; i < isOccupied[targetRow].length; i++) {
                    if (targetCol - i > 0 && !isOccupied[targetRow][targetCol - i]){
                        isOccupied[targetRow][targetCol - i] = true;
                        hasFoundFreePlace = true;
                        traveledDistance += targetCol - i;
                        break;
                    }
                    if (targetCol + i < isOccupied[targetRow].length && !isOccupied[targetRow][targetCol + i]){
                        isOccupied[targetRow][targetCol + i] = true;
                        hasFoundFreePlace = true;
                        traveledDistance += targetCol + i;
                        break;
                    }
                }
            }
            if (hasFoundFreePlace){
                System.out.println(traveledDistance);
            } else {
                System.out.println(String.format("Row %d full", targetRow));
            }



            input = scanner.nextLine();
        }
    }
}

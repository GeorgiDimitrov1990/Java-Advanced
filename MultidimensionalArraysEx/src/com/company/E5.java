package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] rowsAndCols = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String[][] matrix = new String[rowsAndCols[0]][rowsAndCols[1]];
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split(" ");
        }

        String input = scanner.nextLine();
        while (!input.equals("END")) {

            String[] data = input.split("\\s+");
            if (data.length == 5 && data[0].equals("swap")){
                int row1 = Integer.parseInt(data[1]);
                int col1 = Integer.parseInt(data[2]);
                int row2 = Integer.parseInt(data[3]);
                int col2 = Integer.parseInt(data[4]);
                swapElements(row1, row2, col1, col2, matrix);
            } else {
                System.out.println("Invalid input!");

            }


            input = scanner.nextLine();
        }
    }

    private static void swapElements(int row1, int row2, int col1, int col2,String[][] matrix) {
        if (isValid(row1, col1, matrix) && isValid(row2, col2, matrix)) {
            String tempElement = matrix[row1][col1];
            matrix[row1][col1] = matrix[row2][col2];
            matrix[row2][col2] = tempElement;
            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[row].length; col++) {
                    System.out.print(matrix[row][col] + " ");
                }
                System.out.println();
            }

        } else {
            System.out.println("Invalid input!");
        }
    }

    private static boolean isValid(int row, int col, String[][] matrix) {
        if (row >=0 && row < matrix.length && col >=0 && col < matrix[row].length){
            return true;
        }
        return false;
    }
}

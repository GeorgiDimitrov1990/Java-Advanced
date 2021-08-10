package com.company;

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split(", ");
        int n = Integer.parseInt(tokens[0]);
        String fillPattern = tokens[1];
        int[][] matrix = fillMatrix(n, fillPattern);
        printMatrix(matrix);
    }

    private static int[][] fillMatrix(int n, String fillPattern) {
        int[][] matrix = new int[n][n];

        if ("A".equals(fillPattern)){
            fillPatternA(matrix);
        } else if ("B".equals(fillPattern)){
            fillPatternB(matrix);
        }
        return matrix;
    }

    private static void fillPatternB(int[][] matrix) {
        int number = 1;
        for (int col = 0; col < matrix.length; col++) {
            if (col % 2 == 0){
                for (int row = 0; row < matrix[col].length ; row++) {
                    matrix[row][col] = number++;
                }
            }else {
                for (int row = matrix[col].length-1; row >= 0 ; row--) {
                    matrix[row][col] = number++;
                }
            }
        }

    }


    private static void fillPatternA(int[][] matrix) {
        int number = 1;
        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix[col].length ; row++) {
                matrix[row][col] = number++;
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(String.format("%d ", element));
            }
            System.out.println();
        }
    }
}

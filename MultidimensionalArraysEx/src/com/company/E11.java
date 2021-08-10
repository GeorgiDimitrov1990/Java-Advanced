package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class E11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int r = input[0];
        int c = input[1];
        int[][] matrix = new int[r][c];
        for (int row = 0; row < r; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        int rows = r - 1;
        int cols = c - 1;

        while (rows >=0){
            int innerRow = rows;
            int innerCol = cols;
            while (innerRow >= 0 && innerCol <= c-1){
                System.out.print(matrix[innerRow--][innerCol++] + " ");
            }
            System.out.println();
            cols--;
            if (cols < 0){
                cols = 0;
                rows--;
            }


        }
    }
}

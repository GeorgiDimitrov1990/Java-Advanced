package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] rowsAndCols = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];
        int multiplier = 1;

        List<List<Integer>> matrix = new ArrayList<>();
        for (int row = 0; row < rows; row++) {
            List<Integer> list = new ArrayList<>();
            if (row == 0) {
                for (int col = 0; col < cols; col++) {
                    list.add(col + 1);
                }
            } else {
                for (int col = 0; col < cols; col++) {
                    list.add((multiplier * cols) + col + 1);
                }
                multiplier++;
            }
            matrix.add(list);
        }

        String input = scanner.nextLine();
        while (!input.equals("Nuke it from orbit")) {
            int[] tokens = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
            int targetRow = tokens[0];
            int targetCol = tokens[1];
            int radius = tokens[2];

            int up = targetRow - radius;
            if (up < 0){
                up = 0;
            }
            int down = targetRow + radius;
            if (down > matrix.size() -1){
                down = matrix.size()- 1;
            }
            int right = targetCol + radius;
            if (right > matrix.get(targetRow).size()-1){
                right = matrix.get(targetRow).size()-1;
            }
            int left = targetCol - radius;
            if (left <0){
                left = 0;
            }
            for (int i = up; i < targetRow ; i++) {
                if (matrix.get(i).size() < targetCol){
                    continue;
                }
                matrix.get(i).remove(targetCol);
            }
            for (int i = targetRow +1; i <= down ; i++) {
                if (matrix.get(i).size() < targetCol){
                    continue;
                }
                matrix.get(i).remove(targetCol);
            }
            for (int i = left; i <= right ; i++) {
                matrix.get(targetRow).remove(left);
            }

            matrix.removeIf(List::isEmpty);

            input = scanner.nextLine();
        }

        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(i).size(); j++) {
                System.out.print(matrix.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }
}

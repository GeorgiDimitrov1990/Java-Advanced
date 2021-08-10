package com.company;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        String regex = "[0-9]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(command);
        int degrees = 0;

        while (matcher.find()){
            degrees = Integer.parseInt(matcher.group());
        }
        ArrayDeque<String> queue = new ArrayDeque<>();
        String input = scanner.nextLine();

        int cols = 0;
        int rows = 0;

        while (!input.equals("END")){
            queue.offer(input);
            if (input.length() > cols){
                cols = input.length();
            }
            rows++;
            input=scanner.nextLine();
        }

        char[][] matrix = new char[rows][cols];
        for (int row = 0; row < matrix.length; row++) {
            Arrays.fill(matrix[row], ' ');
        }

        for (int row = 0; row < matrix.length; row++) {
            String current = queue.poll();
            char[] charArray = current.toCharArray();
            for (int col = 0; col < charArray.length; col++) {
                matrix[row][col] = charArray[col];
            }
        }
        int rotate = (degrees / 90) % 4;

        if (rotate == 0){
            printMatrix(matrix);
        } else if (rotate == 1){
            char[][] newMatrix = new char[cols][rows];
            int rowOldMatrix =0;
            for (int col = newMatrix[0].length-1; col >=0 ; col--) {
                for (int row = 0; row < newMatrix.length; row++) {
                    newMatrix[row][col] = matrix[rowOldMatrix][row];
                }
                rowOldMatrix++;
            }
            printMatrix(newMatrix);
        } else if (rotate == 2){
            char[][] newMatrix = new char[rows][cols];
            int oldMatrixRows = 0;
            int oldMatrixCols = 0;
            for (int row = newMatrix.length -1 ; row >= 0; row--) {
                for (int col = newMatrix[row].length -1; col >=0 ; col--) {
                    newMatrix[row][col]= matrix[oldMatrixRows][oldMatrixCols];
                    oldMatrixCols++;
                }
                oldMatrixCols = 0;
                oldMatrixRows++;
            }
            printMatrix(newMatrix);
        } else if (rotate == 3){
            char[][] newMatrix = new char[cols][rows];
            int oldMatrixRows = 0;
            int oldMatrixCols = 0;
            for (int col = 0; col < newMatrix[0].length; col++) {
                for (int row = newMatrix.length-1; row >=0 ; row--) {
                    newMatrix[row][col] = matrix[oldMatrixRows][oldMatrixCols];
                    oldMatrixCols++;
                }
                oldMatrixCols = 0;
                oldMatrixRows++;
            }
            printMatrix(newMatrix);
        }



    }
    private static void printMatrix(char[][] matrix){
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }
}

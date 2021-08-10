import java.util.Arrays;
import java.util.Scanner;

public class AllDiagonals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][n];
        for (int row = 0; row < n; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int row = 0;
        int col = n - 1;

        while (row < n) {
            int innerRow = row;
            int innerCol = col;
            while (innerRow < n && innerCol < n) {
                System.out.println(matrix[innerRow++][innerCol++] + " ");
            }
            System.out.println();
            col--;
            if (col <0){
                col = 0;
                row++;
            }
        }
    }
}

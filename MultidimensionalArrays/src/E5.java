import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int [][] matrix = new int[n][n];
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        ArrayDeque<Integer> secondQueue = new ArrayDeque<>();
        for (int row = 0; row < n; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        int firstCounter = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (col == firstCounter) {
                    System.out.print(matrix[row][firstCounter] + " ");
                }
            }
            firstCounter++;
        }
        System.out.println();

        int secondCounter = 0;
        for (int row = matrix.length - 1; row >= 0; row--) {
            for (int col = 0; col <matrix[row].length; col++) {
                if (col == secondCounter) {
                    System.out.print(matrix[row][secondCounter] + " ");
                }
            }
            secondCounter++;
        }

       /* while (!queue.isEmpty()){
            System.out.print(queue.poll() + " ");
        }
        System.out.println();
        while (!secondQueue.isEmpty()){
            System.out.print(secondQueue.poll() + " ");
        }*/

    }
}

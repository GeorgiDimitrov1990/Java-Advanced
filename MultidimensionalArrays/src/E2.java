import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

       int rows = dimensions[0];
       int cols = dimensions[1];

       int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            String[] token = scanner.nextLine().split(" ");
            for (int i = 0; i < token.length; i++) {
                matrix[row][i] = Integer.parseInt(token[i]);
            }
        }
        int number = Integer.parseInt(scanner.nextLine());

        ArrayList<int[]> positions = new ArrayList<>();



        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == number){
                    int[] indexes = {row, col};
                    positions.add(indexes);
                }
            }
        }
        if (positions.isEmpty()){
            System.out.println("not found");
        } else {
            for (int[] position : positions) {
                System.out.println(position[0] + " " + position[1]);
            }

        }

    }

}

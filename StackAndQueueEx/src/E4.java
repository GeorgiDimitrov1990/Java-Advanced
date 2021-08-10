import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[]  inputArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = inputArr[0];
        int s = inputArr[1];
        int x = inputArr[2];

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < n; i++) {
            queue.offer(numbers[i]);
        }

        while (!queue.isEmpty() && s >0){
            queue.poll();
            s--;
        }
        if (queue.isEmpty()){
            System.out.println("0");
        } else if (queue.contains(x)){
            System.out.println("true");
        } else {
            System.out.println(Collections.min(queue));
        }


    }
}

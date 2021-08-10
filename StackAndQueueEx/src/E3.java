import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            int[] line = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            switch (line[0]){
                case 1:
                    deque.push(line[1]);
                    break;
                case 2:
                    if (!deque.isEmpty()){
                        deque.pop();
                    }
                    break;
                case 3:
                    Integer max = Collections.max(deque);
                    System.out.println(max);
                    break;
            }
        }
    }
}

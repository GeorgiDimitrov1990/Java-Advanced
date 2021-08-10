import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int push = inputArr[0];
        int pop = inputArr[1];
        int number = inputArr[2];

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < push; i++) {
            stack.push(numbers[i]);
        }
        while (pop > 0 && !stack.isEmpty()){
            stack.pop();
            pop--;
        }
        if (stack.isEmpty()){
            System.out.println("0");
        } else if (stack.contains(number)){
            System.out.println("true");
        } else {
            Integer minElement = Collections.min(stack);
            System.out.println(minElement);
        }
        /*boolean flag = false;
        int min = Integer.MAX_VALUE;
        for (Integer integer : stack) {
            if (integer < min) {
                min = integer;
            }
            if (integer == number) {
                flag = true;
                break;
            }
        }

        if (stack.isEmpty()){
            System.out.println("0");
        }else if (flag) {
            System.out.println("true");
        } else {
            System.out.println(min);
        }*/

    }
}

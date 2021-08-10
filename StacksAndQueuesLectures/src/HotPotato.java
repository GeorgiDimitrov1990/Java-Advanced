import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> arr = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        ArrayDeque<String> first = new ArrayDeque<>();
        ArrayDeque<String> second = new ArrayDeque<>();
        ArrayDeque<String> third = new ArrayDeque<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (String s : arr) {
            first.offer(s);
        }
        int counter = 1;

        while (true){
            while (!first.isEmpty()){
                if (counter == n){
                    third.offer(first.poll());
                    counter = 1;
                    continue;
                }
                second.offer(first.poll());
                counter++;
            }
            while (!second.isEmpty()){
                if (counter == n){
                    third.offer(second.poll());
                    counter = 1;
                    continue;
                }
                first.offer(second.poll());
                counter++;
            }
            if (first.isEmpty() && second.isEmpty()){
                break;
            }
        }
        while (!third.isEmpty()){
            if (third.size() == 1){
                System.out.println("Last is " + third.poll());
                break;
            }
            System.out.println("Removed " + third.poll());
        }

    }
}

import java.util.*;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> arr = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        ArrayDeque<Integer> plants = new ArrayDeque<>();
        for (Integer integer : arr) {
            queue.offer(integer);
        }

        int counter = 0;
        while (true) {
            int current = Integer.MAX_VALUE;
            for (Integer integer : queue) {
                if (integer < current){
                    plants.offer(integer);
                }
                current = integer;

            }

            if (plants.size() == queue.size()){
                break;
            } else {
               while (!queue.isEmpty()){
                   queue.poll();
               }
                while (!plants.isEmpty()){
                    queue.offer(plants.poll());
                }

            }
            counter++;
        }
        System.out.println(counter);
    }
}

import java.util.*;
import java.util.stream.Collectors;

public class asd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        priorityQueue.offer(42);
        priorityQueue.offer(13);
        priorityQueue.offer(73);
        priorityQueue.offer(69);
        while (!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
            /*ArrayDeque<Integer> queue = Arrays.stream(scanner.nextLine().split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toCollection(ArrayDeque::new));*/
              /*ArrayDeque<Integer> stack = new ArrayDeque<>();
                      Arrays.stream(scanner.nextLine().split(" "))
                    .map(Integer::parseInt)
                    .forEach(e -> stack.push(e));*/
        }
    }
}

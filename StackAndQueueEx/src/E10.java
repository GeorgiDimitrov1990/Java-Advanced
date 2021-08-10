import java.util.*;
import java.util.stream.Collectors;

public class E10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> arr = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        ArrayDeque<Integer> plants = new ArrayDeque<>();
        int counter = 0;
        while (true) {
            for (int i = 0; i < arr.size(); i++) {
                if (i == 0) {
                    plants.offer(arr.get(i));
                } else {
                    if (arr.get(i) <= arr.get(i-1)) {
                        plants.offer(arr.get(i));
                    }
                }
            }
            if (plants.size() == arr.size()){
                break;
            } else {
                arr = new ArrayList<>();
                while (!plants.isEmpty()){
                    arr.add(plants.poll());
                }

            }
            counter++;
        }
        System.out.println(counter);
    }
}

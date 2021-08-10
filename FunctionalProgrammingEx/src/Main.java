import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class  Main {
    public static void main(String[] args) {
        Consumer<Integer> print = System.out::println;
        Consumer<List<Integer>> modify= list -> {
            for (int i = 0; i < list.size(); i++) {
                list.set(i, list.get(i) * 2);
            }
        };

        List<Integer> numbers = Arrays.asList(2,3,5,6);
        modify.accept(numbers);
        numbers.forEach(print);
    }
}

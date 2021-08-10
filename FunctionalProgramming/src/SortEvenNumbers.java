import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(", ");
        // За да преобразуваме от IntStream към Stream<String> трябва да използваме mapToObj или .boxed() и след това .map().
        // boxed() преобразува потока(Stream)
        String output = Arrays.stream(arr)
                .mapToInt(e -> Integer.parseInt(e))
                .filter(e -> e % 2 == 0)
                .mapToObj(e -> String.valueOf(e))
                .collect(Collectors.joining(", "));
        System.out.println(output);

        output = Arrays.stream(arr)
                .mapToInt(e -> Integer.parseInt(e))
                .filter(e -> e % 2 == 0)
                .sorted()
                .boxed()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
        System.out.println(output);

        List<Integer> numbers = Arrays.stream(arr)
                .map(Integer::valueOf)
                .collect(Collectors.toList());

        /*numbers.removeIf(e -> e % 2 != 0);*/
        // премахване на обекти

    }
}

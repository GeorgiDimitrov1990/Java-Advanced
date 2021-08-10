import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names= Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        Consumer<String> printer = name -> System.out.println(name);
        names.forEach(printer);
        /*Consumer<List<String>> printer1 = name -> {
            for (int i = 0; i < name.size(); i++) {
                System.out.println(name.get(i));
            }
        };
        printer1.accept(names);*/
    }
}

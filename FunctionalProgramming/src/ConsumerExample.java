import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Consumer<Double> doublePrinter = num -> System.out.printf("%.2f", num);

        doublePrinter.accept(Math.PI);
    }

}

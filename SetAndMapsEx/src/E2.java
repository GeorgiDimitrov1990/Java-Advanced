import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int firstSetSize = Integer.parseInt(input.split(" ")[0]);
        int secondSetSize = Integer.parseInt(input.split(" ")[1]);


        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();

        for (int i = 0; i < firstSetSize; i++) {
            firstSet.add(Integer.parseInt(scanner.nextLine()));
        }
        for (int i = 0; i < secondSetSize; i++) {
            secondSet.add(Integer.parseInt(scanner.nextLine()));
        }

        firstSet.retainAll(secondSet);

        firstSet.forEach(e -> System.out.print(e + " "));


    }
}

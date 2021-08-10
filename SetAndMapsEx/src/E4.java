import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class E4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character, Integer> occurrences = new TreeMap<>();

        String input = scanner.nextLine();
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            occurrences.putIfAbsent(current, 0);
            occurrences.put(current, occurrences.get(current) + 1);
        }
        occurrences.entrySet()
                .forEach(e-> System.out.printf("%c: %d time/s%n", e.getKey(), e.getValue()));



    }
}

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> phoneBook = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("search")){
            String[] tokens = input.split("-");
            String name = tokens[0];
            String phoneNumber = tokens[1];
            phoneBook.put(name, phoneNumber);

            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!input.equals("stop")){

            if (phoneBook.containsKey(input)){
                System.out.println(input + " -> " + phoneBook.get(input));
            } else {
                System.out.println("Contact " + input + " does not exist.");
            }

            input = scanner.nextLine();
        }

    }
}

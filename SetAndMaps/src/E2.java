import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> vips = new LinkedHashSet<>();
        Set<String> regulars = new LinkedHashSet<>();

        String input = scanner.nextLine();

        while (!input.equals("PARTY")){

            if (Character.isDigit(input.charAt(0))){
                vips.add(input);
            } else {
                regulars.add(input);
            }

            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        TreeSet<String> allGuest = new TreeSet<>();
        allGuest.addAll(vips);
        allGuest.addAll(regulars);

        while (!input.equals("END")){

            allGuest.remove(input);

            input = scanner.nextLine();
        }

        System.out.println(allGuest.size());

        System.out.println(String.join(System.lineSeparator(), allGuest));

    }
}

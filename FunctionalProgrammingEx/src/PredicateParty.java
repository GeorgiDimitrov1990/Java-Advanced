import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       //използвай startsWith, и endsWith методите на String

        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        String command = scanner.nextLine();


        while (!command.equals("Party!")){
            String[] tokens = command.split("\\s+");
            Predicate<String> startWith = e -> e.startsWith(tokens[2]);
            Predicate<String> endWith = e -> e.endsWith(tokens[2]);
            Predicate<String> length = e -> e.length() == Integer.parseInt(tokens[2]);

            switch (tokens[0]){

                case "Remove":

                    switch (tokens[1]){
                        case "StartsWith":
                            names.removeIf(startWith);
                            break;
                        case "EndsWith":
                            names.removeIf(endWith);
                            break;
                        case "Length":
                            names.removeIf(length);
                            break;
                    }

                    break;
                case "Double":
                    int listLength = names.size();
                    switch (tokens[1]){
                        case "StartsWith":
                            for (int i = 0; i < listLength; i++) {
                                if (startWith.test(names.get(i))){
                                    names.add(names.get(i));
                                }
                            }


                            break;
                        case "EndsWith":
                            for (int i = 0; i < listLength; i++) {
                                if (endWith.test(names.get(i))){
                                    names.add(names.get(i));
                                }
                            }
                            break;
                        case "Length":
                            for (int i = 0; i < listLength; i++) {
                                if (length.test(names.get(i))){
                                    names.add(names.get(i));
                                }
                            }
                            break;
                    }
                    break;


            }


            command = scanner.nextLine();
        }
        if (!names.isEmpty()) {
            Collections.sort(names);
            System.out.print(String.join(", ", names));
            System.out.print(" are going to the party!");
        } else {
            System.out.println("Nobody is going to the party!");
        }
    }
}

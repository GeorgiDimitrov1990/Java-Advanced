import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ThePartyReservationFilterModule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Predicate<String>> map = new HashMap<>();
        List<String> names = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());


        String input = scanner.nextLine();

        while(!input.equals("Print")){
            String[] tokens = input.split(";");
            String command = tokens[1];
            String criteria = tokens[2];
            Predicate<String> startWith = e -> e.startsWith(criteria);
            Predicate<String> endsWith = e -> e.endsWith(criteria);
            Predicate<String> length = e -> e.length() == Integer.parseInt(criteria);
            Predicate<String> contains = e -> e.contains(criteria);
            switch (tokens[0]){

                case "Add filter":
                    switch (command){
                        case "Starts with":
                            map.put(command + criteria, startWith);
                            break;
                        case "Ends with":
                            map.put(command + criteria, endsWith);
                            break;
                        case "Length":
                            map.put(command + criteria, length);
                            break;
                        case "Contains":
                            map.put(command + criteria, contains);
                            break;
                    }
                    break;
                case "Remove filter":
                    switch (command){
                        case "Starts with":
                        case "Contains":
                        case "Length":
                        case "Ends with":
                            map.remove(command + criteria);
                            break;

                    }

                    break;

            }


            input = scanner.nextLine();
        }

        map.values().forEach(e -> names.removeIf(e));

        for (String name : names) {
            System.out.print(name + " ");
        }


    }
}

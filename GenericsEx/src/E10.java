import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split("\\s+");
        Tuple<String, String> name = new Tuple<>(tokens[0], tokens[1]);
        Tuple<Tuple<String, String>, String> nameAndAddress = new Tuple<>(name, tokens[2]);
        System.out.println(String.format("%s %s -> %s", name.getItem1(), name.getItem2(), nameAndAddress.getItem2()));

        String[] tokens1 = scanner.nextLine().split("\\s+");
        Tuple<String, Integer> nameAndBeers = new Tuple<>(tokens1[0], Integer.parseInt(tokens1[1]));
        nameAndBeers.print();

        String[] tokens2 = scanner.nextLine().split("\\s+");
        Tuple<Integer, Double> integerDoubleTuple = new Tuple<>(Integer.parseInt(tokens2[0]), Double.parseDouble(tokens2[1]));
        integerDoubleTuple.print();
    }
}

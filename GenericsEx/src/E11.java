import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Threeuple> threeuples = new ArrayList<>();

        String[] tokens1 = scanner.nextLine().split("\\s+");
        String name = tokens1[0] + " " + tokens1[1];
        Threeuple<String, String, String> nameAndAddress = new Threeuple<>(name, tokens1[2], tokens1[3]);
        threeuples.add(nameAndAddress);

        String[] tokens2 = scanner.nextLine().split("\\s+");
        boolean isDrunk = tokens2[2].equals("drunk");
        Threeuple<String, Integer, Boolean> nameAndBeers = new Threeuple<>(tokens2[0], Integer.parseInt(tokens2[1]), isDrunk);
        threeuples.add(nameAndBeers);

        String[] tokens3 = scanner.nextLine().split("\\s+");
        Threeuple<String, Double, String> nameAndBank = new Threeuple<>(tokens3[0], Double.parseDouble(tokens3[1]), tokens3[2]);
        threeuples.add(nameAndBank);

        print(threeuples);



    }
    public static void print (List<Threeuple> list){
        StringBuilder sb = new StringBuilder();
        for (Threeuple threeuple : list) {
            sb.append(threeuple).append(System.lineSeparator());
        }
        System.out.println(sb.toString());

    }
}

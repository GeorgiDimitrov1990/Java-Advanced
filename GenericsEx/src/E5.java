import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Box<String> box = new Box<>();
        for (int i = 0; i < n; i++) {
            String text = scanner.nextLine();
            box.add(text);
        }

        String elementForCompare = scanner.nextLine();
        int countGreater = box.countGreaterThan(elementForCompare);
        System.out.println(countGreater);
    }
}

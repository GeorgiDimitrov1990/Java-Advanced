import java.util.ArrayDeque;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         String input = scanner.nextLine();
         String current = null;
         ArrayDeque<String> history = new ArrayDeque<>();
        while (!input.equals("Home")){


             if (input.equals("back")){
                 if (history.isEmpty()){
                     System.out.println("no previous URLs");
                     input = scanner.nextLine();
                     continue;
                 } else {
                     current = history.pop();
                 }
             } else {
                 if (current != null) {
                     history.push(current);
                 }
                 current = input;
             }

             System.out.println(current);
             input = scanner.nextLine();
         }
    }
}
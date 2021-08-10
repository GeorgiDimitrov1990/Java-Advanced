import java.util.ArrayDeque;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split(" ");
        ArrayDeque<Integer> number = new ArrayDeque<>();
        for (int i = 0; i< tokens.length; i++) {
            String token = tokens[i];
            if (Character.isDigit(token.charAt(0))){
                number.push(Integer.parseInt(token));
            } else {
               int rightOperand = Integer.parseInt(tokens[++i]);
               int leftOperand = number.peek();
               number.push(rightOperand);

               int result = token.equals("+")
                       ? leftOperand + rightOperand
                       : leftOperand - rightOperand;
               number.push(result);
            }
        }


        System.out.println(number.peek());
    }
}

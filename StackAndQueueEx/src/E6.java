import java.util.ArrayDeque;
import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("");
        ArrayDeque<String> deque = new ArrayDeque<>();

        if (input.length % 2 != 0){
            System.out.println("NO");
        } else {
            for (int i = 0; i < input.length; i++) {
                String current = input[i];

                if (current.equals("{") || current.equals("(") || current.equals("[")){
                    deque.push(current);
                } else {
                    String pop = deque.pop();
                    if (pop.equals("(") && !current.equals(")")){
                        break;
                    }
                    if (pop.equals("{") && !current.equals("}")){
                        break;
                    }
                    if (pop.equals("[") && !current.equals("]")){
                        break;
                    }
                }

            }
            if (deque.isEmpty()){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }


        /*{{[[( ()  )]]}}*/
    }
}

import java.util.*;

public class E9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> operand = new HashMap<>();
        operand.put("+", 1);
        operand.put("-", 1);
        operand.put("*", 2);
        operand.put("/", 2);
        operand.put("(", 0);
        ArrayDeque<String> queue = new ArrayDeque<>();
        ArrayDeque<String> stack = new ArrayDeque<>();
        String[] input = scanner.nextLine().split(" ");
        for (int i = 0; i < input.length; i++) {
            String currentString = input[i];
            if (Character.isDigit(input[i].charAt(0)) || Character.isLetter(input[i].charAt(0))) {
                queue.offer(currentString);
            } else {
                if (stack.isEmpty()) {
                    stack.push(currentString);
                } else {

                    if (currentString.equals(")")) {
                        String movedString = stack.pop();
                        while (!movedString.equals("(")) {
                            queue.offer(movedString);
                            movedString = stack.pop();
                        }
                        continue;
                    }

                    if (operand.get(currentString) > operand.get(stack.peek())) {
                        stack.push(currentString);
                    } else if (currentString.equals("(")) {
                        stack.push(currentString);
                    } else {
                        while (!stack.isEmpty()) {
                            if (operand.get(currentString) <= operand.get(stack.peek())) {
                                String pop = stack.pop();
                                queue.offer(pop);
                            }
                        }
                        stack.push(currentString);
                    }
                }
            }
        }
        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
    }
}

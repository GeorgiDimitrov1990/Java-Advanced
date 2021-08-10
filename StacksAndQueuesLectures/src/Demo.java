import java.util.ArrayDeque;

public class Demo {
    public static void main(String[] args) {
        ArrayDeque<Integer> stackOfNumbers = new ArrayDeque<>();
        // push(type)
        // (type) pop -give the element and remove the top element
        // (type) peek - give the top element
        stackOfNumbers.push(13);
        stackOfNumbers.push(32);
        System.out.println(stackOfNumbers.peek());
        System.out.println(stackOfNumbers.pop());
        System.out.println(stackOfNumbers.peek());
        System.out.println(stackOfNumbers.pop());

    }
}

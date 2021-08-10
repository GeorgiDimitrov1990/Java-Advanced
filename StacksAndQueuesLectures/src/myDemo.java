import java.util.ArrayDeque;
import java.util.Scanner;

public class myDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.offer(1);
        arrayDeque.offer(2);
        arrayDeque.offer(3);
        arrayDeque.push(4);
        arrayDeque.push(5);
        arrayDeque.push(6);
        arrayDeque.offer(7);
        int poll = arrayDeque.poll();
        int pop = arrayDeque.pop();
        System.out.println();
    }
}

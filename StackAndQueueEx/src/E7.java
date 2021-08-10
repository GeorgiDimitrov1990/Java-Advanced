import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        long[] fibonacci = new long[n + 1];
        if (n == 0){
            fibonacci[0] = 1;
        } else {

            fibonacci[0] = 1;
            fibonacci[1] = 1;
        }

        for (int i = 2; i <= n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        System.out.println(fibonacci[n]);

    }
}

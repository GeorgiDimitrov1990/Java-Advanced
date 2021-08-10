import java.util.Scanner;
import java.util.TreeMap;

public class E11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, TreeMap<String, Integer>> users = new TreeMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            String ip = tokens[0];
            String user = tokens[1];
            int duration = Integer.parseInt(tokens[2]);

            users.putIfAbsent(user, new TreeMap<>());
            users.get(user).putIfAbsent(ip, 0);
            users.get(user).put(ip, users.get(user).get(ip) + duration);

        }
        users.entrySet().stream()
                .forEach(user -> {
                    int sumDuration =  user.getValue().values().stream().mapToInt(Integer::intValue).sum();
                    System.out.print(String.format("%s: %d ", user.getKey(), sumDuration));
                    System.out.print("[");
                    System.out.print(String.join(", ", user.getValue().keySet()));
                    System.out.print("]");
                    System.out.println();
                });
    }
}

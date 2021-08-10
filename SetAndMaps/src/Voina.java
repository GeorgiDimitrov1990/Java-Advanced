import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Voina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> firstDeck = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toCollection(LinkedHashSet::new));

        Set<Integer> secondDeck = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        int round = 50;

        while (round-- > 0 && !firstDeck.isEmpty() && !secondDeck.isEmpty()){

            Integer firstCard = firstDeck.iterator().next();
            firstDeck.remove(firstCard);
            Integer secondCard = secondDeck.iterator().next();
            secondDeck.remove(secondCard);

            if (firstCard > secondCard) {
                firstDeck.add(firstCard);
                firstDeck.add(secondCard);
            } else {
                secondDeck.add(secondCard);
                secondDeck.add(firstCard);
            }

        }

        if (secondDeck.size()>firstDeck.size()){
            System.out.println("Second player win!");
        } else if (firstDeck.size() >secondDeck.size()){
            System.out.println("First player win!");
        } else {
            System.out.println("Draw!");
        }
    }
}

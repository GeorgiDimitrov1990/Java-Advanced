import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(13, 42, 69);
        // Предиката приема параметър и връща боолеан.
        // и двете са едно и също, само че предиката знае че връща боолеан.
        Predicate<Integer> isEven = num -> num % 2 == 0;
        Function<Integer, Boolean> isEven1 = num -> num % 2 == 0;
        System.out.println(isEven.test(13));
        System.out.println(isEven1.apply(42));
    }
}

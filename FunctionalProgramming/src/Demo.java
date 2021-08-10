import java.util.function.Function;

public class Demo {
    public static void main(String[] args) {
        Function<Integer, Integer> numToSquare = x -> x * x;
        System.out.println(numToSquare.apply(4));
    }
}

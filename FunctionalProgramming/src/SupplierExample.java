import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        List<Integer> nums = List.of(13 ,42, 69);


        // Връща optional, защото листа може да е празен!
        /*Optional<Integer> max = nums.stream()
                .max(Integer::compareTo);*/
        Supplier<Optional<Integer>> supplier = () -> Optional.of(13);

        int max = nums.stream()
                .max(Integer::compareTo).or(supplier).get();

    }
}

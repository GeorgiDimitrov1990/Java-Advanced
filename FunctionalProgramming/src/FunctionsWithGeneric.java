import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionsWithGeneric {
    public static void main(String[] args) {

    }

    public static <T> List<T> getFilteredList(List<T> elements, Predicate<T> predicate){
       /* List<T> result = new ArrayList<>();
        for (T element : elements) {
            if (predicate.test(element)){
                result.add(element);
            }
        }
        return result;*/

        return elements.stream()
                .filter(predicate)
                .collect(Collectors.toList());

    }
}

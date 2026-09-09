import java.util.Arrays;
import java.util.List;

public class StreamDistinct {
    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(10, 20, 10, 30, 20, 40);

        numbers.stream()
                .distinct()
                .forEach(System.out::println);
    }
}

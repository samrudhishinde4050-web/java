import java.util.Arrays;
import java.util.List;

public class StreamFilter {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(10, 15, 20, 25, 30);

        numbers.stream()
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);

    }

}

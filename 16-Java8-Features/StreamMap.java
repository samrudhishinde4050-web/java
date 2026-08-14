import java.util.Arrays;
import java.util.List;

public class StreamMap {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(1, 2, 3, 4, 5);

        numbers.stream()
                .map(number -> number * 2)
                .forEach(System.out::println);

    }

}

import java.util.Arrays;
import java.util.List;

public class StreamCount {
    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(10, 20, 30, 40, 50);

        long count = numbers.stream()
                .filter(number -> number > 25)
                .count();

        System.out.println("Count: " + count);
    }
}

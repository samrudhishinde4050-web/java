import java.util.Arrays;
import java.util.List;

public class UpperBoundWildcard {

    static double sum(List<? extends Number> numbers) {

        double total = 0;

        for (Number number : numbers) {

            total += number.doubleValue();

        }

        return total;

    }

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 30);

        System.out.println("Sum: " + sum(numbers));

    }

}

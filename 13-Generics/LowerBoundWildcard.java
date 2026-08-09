import java.util.ArrayList;
import java.util.List;

public class LowerBoundWildcard {

    static void addNumbers(List<? super Integer> numbers) {

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println(numbers);

    }

    public static void main(String[] args) {

        List<Number> numbers = new ArrayList<>();

        addNumbers(numbers);

    }

}

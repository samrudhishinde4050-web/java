import java.util.Arrays;

public class ArraySorting {

    public static void main(String[] args) {

        int[] numbers = {40, 10, 30, 20, 50};

        Arrays.sort(numbers);

        for (int number : numbers) {

            System.out.println(number);

        }

    }

}

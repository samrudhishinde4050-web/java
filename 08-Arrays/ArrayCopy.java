import java.util.Arrays;

public class ArrayCopy {

    public static void main(String[] args) {

        int[] numbers={10,20,30};

        int[] copy=Arrays.copyOf(numbers,numbers.length);

        System.out.println(Arrays.toString(copy));

    }

}

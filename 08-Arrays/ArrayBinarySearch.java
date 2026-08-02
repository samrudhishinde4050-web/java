import java.util.Arrays;

public class ArrayBinarySearch {

    public static void main(String[] args) {

        int[] numbers={10,20,30,40,50};

        int index=Arrays.binarySearch(numbers,40);

        System.out.println(index);

    }

}

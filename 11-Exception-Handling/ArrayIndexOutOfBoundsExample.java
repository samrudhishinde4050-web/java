public class ArrayIndexOutOfBoundsExample {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        try {

            System.out.println(numbers[7]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Error: Array index is out of bounds.");

        }

        System.out.println("Program continues after exception handling.");

    }

}

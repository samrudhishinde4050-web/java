public class LargestElement {

    public static void main(String[] args) {

        int[] numbers = {35, 30, 75, 79, 20, 5};

        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > largest) {

                largest = numbers[i];

            }

        }

        System.out.println("Largest Element = " + largest);

    }

}

public class ArraySearching {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        int key = 30;
        boolean found = false;

        for (int number : numbers) {

            if (number == key) {

                found = true;
                break;

            }

        }

        if (found) {

            System.out.println("Element Found");

        } else {

            System.out.println("Element Not Found");

        }

    }

}

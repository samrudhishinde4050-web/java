@FunctionalInterface
interface Calculator {

    int add(int a, int b);

}

public class FunctionalInterface {

    public static void main(String[] args) {

        Calculator calculator = (a, b) -> a + b;

        System.out.println(
                "Sum: " + calculator.add(10, 20)
        );

    }

}

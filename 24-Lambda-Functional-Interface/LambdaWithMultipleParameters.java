interface Calculator {
    int add(int a, int b);
}

public class LambdaWithMultipleParameters {
    public static void main(String[] args) {

        Calculator calculator = (a, b) -> a + b;

        int result = calculator.add(10, 20);

        System.out.println("Sum: " + result);
    }
}

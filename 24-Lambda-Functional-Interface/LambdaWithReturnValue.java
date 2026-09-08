interface Square {
    int calculate(int number);
}

public class LambdaWithReturnValue {
    public static void main(String[] args) {

        Square square = number -> number * number;

        System.out.println("Square: " + square.calculate(5));
    }
}

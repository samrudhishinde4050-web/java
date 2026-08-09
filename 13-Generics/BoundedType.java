class Calculator<T extends Number> {

    double square(T number) {

        return number.doubleValue() * number.doubleValue();

    }

}

public class BoundedType {

    public static void main(String[] args) {

        Calculator<Integer> calculator = new Calculator<>();

        System.out.println(calculator.square(5));

    }

}

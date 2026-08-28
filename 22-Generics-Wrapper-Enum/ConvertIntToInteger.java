public class ConvertIntToInteger {

    public static void main(String[] args) {

        int number = 100;

        Integer integerNumber = Integer.valueOf(number);

        System.out.println("Primitive int: " + number);
        System.out.println("Integer object: " + integerNumber);
    }
}

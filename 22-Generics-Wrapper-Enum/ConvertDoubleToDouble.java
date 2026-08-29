public class ConvertDoubleToDouble {

    public static void main(String[] args) {

        double price = 99.50;

        Double doubleValue = Double.valueOf(price);

        System.out.println("Primitive double: " + price);
        System.out.println("Double object: " + doubleValue);
    }
}

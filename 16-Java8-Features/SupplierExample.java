import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {

        Supplier<String> message =
                () -> "Welcome to Java 8";

        System.out.println(message.get());

    }

}

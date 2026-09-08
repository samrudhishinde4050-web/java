import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {

        Consumer<String> message = name -> {
            System.out.println("Hello " + name);
        };

        message.accept("Samrudhi");
    }
}

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        String name = "Samrudhi";

        Optional<String> optional =
                Optional.ofNullable(name);

        if (optional.isPresent()) {

            System.out.println(
                    "Name: " + optional.get()
            );

        }

    }

}

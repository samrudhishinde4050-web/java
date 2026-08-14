import java.util.Arrays;
import java.util.List;

public class MethodReference {

    public static void main(String[] args) {

        List<String> names =
                Arrays.asList(
                        "Samrudhi",
                        "Rutuja",
                        "Vaishnavi"
                );

        names.forEach(System.out::println);

    }

}

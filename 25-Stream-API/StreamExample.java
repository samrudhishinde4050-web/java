import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "Samrudhi",
                "Rutuja",
                "Vaishnavi"
        );

        names.stream()
                .forEach(name -> System.out.println(name));
    }
}

import java.util.Arrays;
import java.util.List;

public class StreamForEach {
    public static void main(String[] args) {

        List<String> names =
                Arrays.asList("Java", "Spring", "React");

        names.stream()
                .forEach(name -> System.out.println(name));
    }
}

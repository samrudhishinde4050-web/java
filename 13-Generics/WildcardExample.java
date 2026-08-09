import java.util.ArrayList;
import java.util.List;

public class WildcardExample {

    static void display(List<?> list) {

        for (Object value : list) {

            System.out.println(value);

        }

    }

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Samrudhi");
        names.add("Rutuja");

        display(names);

    }

}

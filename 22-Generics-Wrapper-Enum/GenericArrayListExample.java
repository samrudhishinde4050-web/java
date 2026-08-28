import java.util.ArrayList;

public class GenericArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Samrudhi");
        names.add("Rutuja");
        names.add("Vaishnavi");

        for (String name : names) {

            System.out.println(name);
        }
    }
}

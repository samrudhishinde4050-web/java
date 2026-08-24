import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Samrudhi");
        names.add("Rutuja");
        names.add("Vaishnavi");

        System.out.println(names);

        System.out.println("First Name: " + names.get(0));

        names.remove("Rutuja");

        System.out.println("After Remove: " + names);
    }
}

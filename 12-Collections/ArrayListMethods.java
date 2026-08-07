import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        // add()
        names.add("Samrudhi");
        names.add("Rutuja");
        names.add("Vaishnavi");

        System.out.println("After add: " + names);

        // get()
        System.out.println("Element at index 1: " + names.get(1));

        // set()
        names.set(1, "Priya");
        System.out.println("After set: " + names);

        // contains()
        System.out.println("Contains Samrudhi: "
                + names.contains("Samrudhi"));

        // size()
        System.out.println("Size: " + names.size());

        // remove()
        names.remove("Priya");
        System.out.println("After remove: " + names);

    }

}

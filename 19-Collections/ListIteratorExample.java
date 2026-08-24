import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Samrudhi");
        names.add("Rutuja");
        names.add("Vaishnavi");

        ListIterator<String> iterator =
                names.listIterator();

        System.out.println("Forward:");

        while (iterator.hasNext()) {

            System.out.println(iterator.next());
        }

        System.out.println("Backward:");

        while (iterator.hasPrevious()) {

            System.out.println(iterator.previous());
        }
    }
}

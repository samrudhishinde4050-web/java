import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("Samrudhi");
        names.add("Rutuja");
        names.addFirst("Vaishnavi");
        names.addLast("Sneha");

        System.out.println(names);

        names.removeFirst();

        System.out.println("After Remove: " + names);
    }
}

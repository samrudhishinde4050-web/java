import java.util.LinkedList;

public class LinkedListMethods {

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("Samrudhi");
        names.add("Rutuja");

        names.addFirst("Priya");
        names.addLast("Vaishnavi");

        System.out.println(names);

        System.out.println("First: " + names.getFirst());
        System.out.println("Last: " + names.getLast());

        names.removeFirst();
        names.removeLast();

        System.out.println("After removal: " + names);

    }

}

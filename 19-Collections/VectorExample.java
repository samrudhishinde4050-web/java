import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {

        Vector<Integer> numbers = new Vector<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Numbers: " + numbers);

        System.out.println("Size: " + numbers.size());

        System.out.println("Capacity: " + numbers.capacity());
    }
}

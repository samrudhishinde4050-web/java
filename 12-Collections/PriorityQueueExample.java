import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {

        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        numbers.add(30);
        numbers.add(10);
        numbers.add(20);

        System.out.println("Priority Queue: " + numbers);

        System.out.println("Removed: " + numbers.poll());

    }

}

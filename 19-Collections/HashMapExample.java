import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<Integer, String> students =
                new HashMap<>();

        students.put(101, "Samrudhi");
        students.put(102, "Rutuja");
        students.put(103, "Vaishnavi");

        System.out.println(students);

        System.out.println(
                "Student 101: " + students.get(101)
        );
    }
}

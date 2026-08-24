import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {

        TreeMap<Integer, String> students =
                new TreeMap<>();

        students.put(103, "Vaishnavi");
        students.put(101, "Samrudhi");
        students.put(102, "Rutuja");

        System.out.println(students);
    }
}

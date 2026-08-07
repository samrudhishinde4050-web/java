import java.util.LinkedHashMap;

public class LinkedHashMapExample {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> students =
                new LinkedHashMap<>();

        students.put(101, "Samrudhi");
        students.put(102, "Rutuja");
        students.put(103, "Vaishnavi");

        System.out.println(students);

    }

}

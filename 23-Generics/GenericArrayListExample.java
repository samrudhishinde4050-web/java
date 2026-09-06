import java.util.ArrayList;

public class GenericArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Samrudhi");
        students.add("Rutuja");
        students.add("Vaishnavi");

        for (String student : students) {

            System.out.println(student);
        }
    }
}

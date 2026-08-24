import java.util.ArrayList;

public class StudentNamesArrayList {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Samrudhi");
        students.add("Rutuja");
        students.add("Vaishnavi");
        students.add("Sneha");
        students.add("Priya");

        System.out.println("Student Names:");

        for (String student : students) {
            System.out.println(student);
        }
    }
}

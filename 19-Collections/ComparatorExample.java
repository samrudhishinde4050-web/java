import java.util.ArrayList;
import java.util.Comparator;

class Student {

    String name;
    int age;

    Student(String name, int age) {

        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {

        return name + " - " + age;
    }
}

public class ComparatorExample {

    public static void main(String[] args) {

        ArrayList<Student> students =
                new ArrayList<>();

        students.add(new Student("Samrudhi", 20));
        students.add(new Student("Rutuja", 22));
        students.add(new Student("Vaishnavi", 21));

        students.sort(
                Comparator.comparing(
                        student -> student.name
                )
        );

        System.out.println(students);
    }
}

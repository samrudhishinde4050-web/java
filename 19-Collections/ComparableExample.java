import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {

    int age;
    String name;

    Student(int age, String name) {

        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Student other) {

        return this.age - other.age;
    }

    @Override
    public String toString() {

        return name + " - " + age;
    }
}

public class ComparableExample {

    public static void main(String[] args) {

        ArrayList<Student> students =
                new ArrayList<>();

        students.add(new Student(22, "Rutuja"));
        students.add(new Student(20, "Samrudhi"));
        students.add(new Student(21, "Vaishnavi"));

        Collections.sort(students);

        System.out.println(students);
    }
}

import java.util.ArrayList;
import java.util.Collections;
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

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Samrudhi", 22));
        students.add(new Student("Rutuja", 20));
        students.add(new Student("Vaishnavi", 21));

        Collections.sort(students, Comparator.comparingInt(s -> s.age));

        System.out.println(students);

    }

}

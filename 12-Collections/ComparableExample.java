import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {

    int age;

    Student(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student other) {

        return this.age - other.age;

    }

    @Override
    public String toString() {

        return String.valueOf(age);

    }

}

public class ComparableExample {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(22));
        students.add(new Student(20));
        students.add(new Student(21));

        Collections.sort(students);

        System.out.println(students);

    }

}

class Student {

    <T> Student(T value) {

        System.out.println("Value: " + value);

    }

}

public class GenericConstructor {

    public static void main(String[] args) {

        Student s1 = new Student("Samrudhi");

        Student s2 = new Student(100);

    }

}

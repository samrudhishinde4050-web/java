class Student {

    Student() {

        System.out.println("Default Constructor");

    }

    Student(String name) {

        System.out.println("Name : " + name);

    }

}

public class ConstructorOverloading {

    public static void main(String[] args) {

        Student s1 = new Student();

        Student s2 = new Student("Samrudhi");

    }

}

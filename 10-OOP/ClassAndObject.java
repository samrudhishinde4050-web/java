class Student {

    String name = "Prathmesh";
    int age = 21;

    void display() {

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);

    }

}

public class ClassAndObject {

    public static void main(String[] args) {

        Student s = new Student();

        s.display();

    }

}

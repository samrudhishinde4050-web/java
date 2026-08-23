class Student {

    private String name;
    private int age;

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public int getAge() {

        return age;
    }
}

public class Encapsulation {

    public static void main(String[] args) {

        Student student = new Student();

        student.setName("Samrudhi");
        student.setAge(21);

        System.out.println(
                "Name: " + student.getName()
        );

        System.out.println(
                "Age: " + student.getAge()
        );
    }
}

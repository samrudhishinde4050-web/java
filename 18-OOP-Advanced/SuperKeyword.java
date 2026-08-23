class Parent {

    int number = 100;

    void display() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {

    int number = 200;

    void show() {

        System.out.println("Child number: " + number);

        System.out.println(
                "Parent number: " + super.number
        );

        super.display();
    }
}

public class SuperKeyword {

    public static void main(String[] args) {

        Child child = new Child();

        child.show();
    }
}

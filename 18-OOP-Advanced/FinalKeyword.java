class Parent {

    final void display() {

        System.out.println("Final method.");
    }
}

public class FinalKeyword {

    public static void main(String[] args) {

        final int number = 100;

        System.out.println("Final value: " + number);

        Parent parent = new Parent();

        parent.display();
    }
}

class Parent {

    void showParent() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {

    void showChild() {
        System.out.println("Child class");
    }
}

public class SingleInheritance {

    public static void main(String[] args) {

        Child child = new Child();

        child.showParent();
        child.showChild();
    }
}

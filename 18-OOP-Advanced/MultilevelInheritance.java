class GrandParent {

    void grandParentMethod() {
        System.out.println("GrandParent");
    }
}

class Parent extends GrandParent {

    void parentMethod() {
        System.out.println("Parent");
    }
}

class Child extends Parent {

    void childMethod() {
        System.out.println("Child");
    }
}

public class MultilevelInheritance {

    public static void main(String[] args) {

        Child child = new Child();

        child.grandParentMethod();
        child.parentMethod();
        child.childMethod();
    }
}

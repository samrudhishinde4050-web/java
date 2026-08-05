class Animal {

    void sound() {
        System.out.println("Animal Sound");
    }

}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog Barks");
    }

}

class Cat extends Animal {

    void meow() {
        System.out.println("Cat Meows");
    }

}

public class HierarchicalInheritance {

    public static void main(String[] args) {

        Dog d = new Dog();
        Cat c = new Cat();

        d.sound();
        d.bark();

        c.sound();
        c.meow();

    }

}

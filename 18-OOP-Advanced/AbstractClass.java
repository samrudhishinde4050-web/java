abstract class Animal {

    void eat() {
        System.out.println("Animal eats.");
    }

    abstract void sound();
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks.");
    }
}

public class AbstractClass {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.eat();
        dog.sound();
    }
}

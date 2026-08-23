class Animal {

    void eat() {
        System.out.println("Animal eats.");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog barks.");
    }
}

public class Upcasting {

    public static void main(String[] args) {

        Animal animal = new Dog();

        animal.eat();
    }
}

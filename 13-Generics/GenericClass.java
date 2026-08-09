class Box<T> {

    T value;

    Box(T value) {
        this.value = value;
    }

    void display() {
        System.out.println("Value: " + value);
    }

}

public class GenericClass {

    public static void main(String[] args) {

        Box<Integer> numberBox = new Box<>(100);
        numberBox.display();

        Box<String> stringBox = new Box<>("Hello Java");
        stringBox.display();

    }

}

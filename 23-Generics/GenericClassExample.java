class Box<T> {

    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class GenericClassExample {

    public static void main(String[] args) {

        Box<Integer> numberBox = new Box<>();
        numberBox.setValue(100);

        Box<String> stringBox = new Box<>();
        stringBox.setValue("Java");

        System.out.println("Integer: " + numberBox.getValue());
        System.out.println("String: " + stringBox.getValue());
    }
}

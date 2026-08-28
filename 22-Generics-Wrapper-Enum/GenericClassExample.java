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

        Box<Integer> integerBox = new Box<>();

        integerBox.setValue(100);

        System.out.println(
                "Integer Value: " + integerBox.getValue()
        );

        Box<String> stringBox = new Box<>();

        stringBox.setValue("Java");

        System.out.println(
                "String Value: " + stringBox.getValue()
        );
    }
}

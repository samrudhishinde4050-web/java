interface Printer<T> {

    void print(T value);

}

class StringPrinter implements Printer<String> {

    public void print(String value) {

        System.out.println("Message: " + value);

    }

}

public class GenericInterface {

    public static void main(String[] args) {

        StringPrinter printer = new StringPrinter();

        printer.print("Hello Java");

    }

}

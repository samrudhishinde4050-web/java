public class GenericMethodExample {

    public static <T> void display(T value) {

        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {

        display(100);
        display("Java");
        display(10.5);
        display('A');
    }
}

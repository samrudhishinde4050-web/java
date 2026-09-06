public class GenericMaximum {

    public static <T extends Comparable<T>> T maximum(
            T a, T b) {

        if (a.compareTo(b) > 0) {
            return a;
        }

        return b;
    }

    public static void main(String[] args) {

        System.out.println(
                "Maximum Integer: " +
                maximum(20, 50)
        );

        System.out.println(
                "Maximum String: " +
                maximum("Apple", "Mango")
        );
    }
}

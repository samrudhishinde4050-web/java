enum Color {

    RED,
    GREEN,
    BLUE
}

public class EnumMethods {

    public static void main(String[] args) {

        Color color = Color.GREEN;

        System.out.println(
                "Name: " + color.name()
        );

        System.out.println(
                "Ordinal: " + color.ordinal()
        );

        System.out.println(
                "Values:"
        );

        for (Color c : Color.values()) {

            System.out.println(c);
        }
    }
}

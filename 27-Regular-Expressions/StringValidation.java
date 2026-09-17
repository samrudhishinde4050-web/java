import java.util.regex.Pattern;

public class StringValidation {
    public static void main(String[] args) {

        String name = "Samrudhi";

        boolean valid =
                Pattern.matches("[A-Za-z]+", name);

        System.out.println("Valid Name: " + valid);
    }
}

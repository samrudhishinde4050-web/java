import java.util.regex.Pattern;

public class NumberValidation {
    public static void main(String[] args) {

        String value = "123456";

        boolean valid =
                Pattern.matches("\\d+", value);

        System.out.println("Valid Number: " + valid);
    }
}

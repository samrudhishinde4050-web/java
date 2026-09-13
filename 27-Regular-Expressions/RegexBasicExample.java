import java.util.regex.Pattern;

public class RegexBasicExample {
    public static void main(String[] args) {

        String text = "Java";

        boolean result = Pattern.matches("[A-Za-z]+", text);

        System.out.println("Valid: " + result);
    }
}

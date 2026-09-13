import java.util.regex.Pattern;

public class RegexMatch {
    public static void main(String[] args) {

        String number = "12345";

        boolean result = Pattern.matches("\\d+", number);

        System.out.println("Only numbers: " + result);
    }
}

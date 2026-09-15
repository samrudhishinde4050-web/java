import java.util.regex.Pattern;

public class MobileNumberValidation {
    public static void main(String[] args) {

        String mobile = "9876543210";

        String pattern = "^[0-9]{10}$";

        boolean valid =
                Pattern.matches(pattern, mobile);

        System.out.println("Valid Mobile: " + valid);
    }
}

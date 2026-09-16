import java.util.regex.Pattern;

public class PasswordValidation {
    public static void main(String[] args) {

        String password = "Java@123";

        String pattern = "^(?=.*[A-Za-z])(?=.*\\d).{8,}$";

        boolean valid =
                Pattern.matches(pattern, password);

        System.out.println("Valid Password: " + valid);
    }
}

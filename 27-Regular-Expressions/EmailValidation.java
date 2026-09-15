import java.util.regex.Pattern;

public class EmailValidation {
    public static void main(String[] args) {

        String email = "samrudhi@gmail.com";

        String pattern =
                "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        boolean valid =
                Pattern.matches(pattern, email);

        System.out.println("Valid Email: " + valid);
    }
}

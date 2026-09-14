import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexFind {
    public static void main(String[] args) {

        String text = "My age is 22";

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            System.out.println("Number found: " + matcher.group());
        }
    }
}

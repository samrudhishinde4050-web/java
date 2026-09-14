public class RegexReplace {
    public static void main(String[] args) {

        String text = "Java123";

        String result = text.replaceAll("\\d", "");

        System.out.println("Result: " + result);
    }
}

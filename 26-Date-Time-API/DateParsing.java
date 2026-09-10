import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateParsing {
    public static void main(String[] args) {

        String dateText = "09-09-2026";

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate date =
                LocalDate.parse(dateText, formatter);

        System.out.println("Date: " + date);
    }
}

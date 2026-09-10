import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String formattedDate = date.format(formatter);

        System.out.println("Formatted Date: " + formattedDate);
    }
}

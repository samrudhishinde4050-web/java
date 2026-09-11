import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateDifference {
    public static void main(String[] args) {

        LocalDate startDate =
                LocalDate.of(2026, 1, 1);

        LocalDate endDate =
                LocalDate.of(2026, 9, 9);

        long days =
                ChronoUnit.DAYS.between(startDate, endDate);

        System.out.println("Difference: " + days + " days");
    }
}

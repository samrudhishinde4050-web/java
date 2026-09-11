import java.time.LocalDate;

public class AddSubtractDate {
    public static void main(String[] args) {

        LocalDate today = LocalDate.of(2026, 9, 9);

        LocalDate futureDate =
                today.plusDays(10);

        LocalDate previousDate =
                today.minusDays(5);

        System.out.println("Today: " + today);
        System.out.println("After 10 Days: " + futureDate);
        System.out.println("Before 5 Days: " + previousDate);
    }
}

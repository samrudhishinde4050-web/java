import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        System.out.println("Today's Date: " + today);
        System.out.println("Year: " + today.getYear());
        System.out.println("Month: " + today.getMonth());
        System.out.println("Day: " + today.getDayOfMonth());
    }
}

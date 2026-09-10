import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {

        LocalTime time = LocalTime.now();

        System.out.println("Current Time: " + time);
        System.out.println("Hour: " + time.getHour());
        System.out.println("Minute: " + time.getMinute());
    }
}

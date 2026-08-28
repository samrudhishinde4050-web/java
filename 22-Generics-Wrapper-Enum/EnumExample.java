enum WeekDay {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

public class EnumExample {

    public static void main(String[] args) {

        WeekDay today = WeekDay.FRIDAY;

        System.out.println("Today: " + today);
    }
}

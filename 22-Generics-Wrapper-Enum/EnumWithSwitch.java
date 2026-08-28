enum Day {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

public class EnumWithSwitch {

    public static void main(String[] args) {

        Day day = Day.SUNDAY;

        switch (day) {

            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekend");
                break;

            default:
                System.out.println("Weekday");
        }
    }
}

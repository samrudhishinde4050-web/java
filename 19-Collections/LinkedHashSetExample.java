import java.util.LinkedHashSet;

public class LinkedHashSetExample {

    public static void main(String[] args) {

        LinkedHashSet<String> cities =
                new LinkedHashSet<>();

        cities.add("Kolhapur");
        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Pune");

        System.out.println(cities);
    }
}

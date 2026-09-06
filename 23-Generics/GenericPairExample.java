class Pair<K, V> {

    private K key;
    private V value;

    Pair(K key, V value) {

        this.key = key;
        this.value = value;
    }

    public void display() {

        System.out.println("Key: " + key);
        System.out.println("Value: " + value);
    }
}

public class GenericPairExample {

    public static void main(String[] args) {

        Pair<Integer, String> student =
                new Pair<>(101, "Samrudhi");

        student.display();
    }
}

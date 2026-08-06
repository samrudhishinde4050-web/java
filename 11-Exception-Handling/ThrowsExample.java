import java.io.IOException;

public class ThrowsExample {

    static void check() throws IOException {

        throw new IOException("File Not Found");

    }

    public static void main(String[] args) {

        try {

            check();

        } catch (IOException e) {

            System.out.println(e.getMessage());

        }

    }

}

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

    public static void main(String[] args) {

        try (
            FileWriter writer =
                    new FileWriter("message.txt")
        ) {

            writer.write(
                    "Welcome to Java File Handling."
            );

            System.out.println(
                    "Data written successfully."
            );

        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}

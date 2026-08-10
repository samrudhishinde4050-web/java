import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

    public static void main(String[] args) {

        try {

            FileWriter writer =
                    new FileWriter("writer.txt");

            writer.write("Welcome to Java File Handling.");

            writer.close();

            System.out.println("File written successfully.");

        } catch (IOException e) {

            System.out.println("An error occurred.");

        }

    }

}

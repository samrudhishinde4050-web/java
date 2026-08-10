import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public static void main(String[] args) {

        try {

            FileWriter writer = new FileWriter("sample.txt");

            writer.write("Hello Java!");
            writer.write("\nLearning File Handling.");

            writer.close();

            System.out.println("Data written successfully.");

        } catch (IOException e) {

            System.out.println("An error occurred.");

        }

    }

}

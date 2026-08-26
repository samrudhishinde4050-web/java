import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

    public static void main(String[] args) {

        try (
            BufferedWriter writer =
                    new BufferedWriter(
                            new FileWriter("student.txt")
                    )
        ) {

            writer.write("Name: Samrudhi");
            writer.newLine();

            writer.write("Course: Computer Science");
            writer.newLine();

            writer.write("Java File Handling");

            System.out.println(
                    "Data written successfully."
            );

        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}

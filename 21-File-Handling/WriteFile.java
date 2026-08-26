import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public static void main(String[] args) {

        try {

            FileWriter writer =
                    new FileWriter("student.txt");

            writer.write(
                    "Name: Samrudhi\n" +
                    "Course: Computer Science\n" +
                    "Age: 21"
            );

            writer.close();

            System.out.println(
                    "Data written successfully."
            );

        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}

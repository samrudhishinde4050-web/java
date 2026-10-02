import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddStudent {

    public static void addStudent(
            int id,
            String name,
            int age,
            String city) {

        String query =
                "INSERT INTO students (id, name, age, city) " +
                "VALUES (?, ?, ?, ?)";

        try {
            Connection connection =
                    DatabaseConnection.getConnection();

            PreparedStatement statement =
                    connection.prepareStatement(query);

            statement.setInt(1, id);
            statement.setString(2, name);
            statement.setInt(3, age);
            statement.setString(4, city);

            statement.executeUpdate();

            System.out.println(
                    "Student added successfully!"
            );

            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

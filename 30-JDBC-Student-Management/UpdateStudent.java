import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateStudent {

    public static void updateStudent(
            int id,
            String name,
            int age,
            String city) {

        String query =
                "UPDATE students " +
                "SET name = ?, age = ?, city = ? " +
                "WHERE id = ?";

        try {
            Connection connection =
                    DatabaseConnection.getConnection();

            PreparedStatement statement =
                    connection.prepareStatement(query);

            statement.setString(1, name);
            statement.setInt(2, age);
            statement.setString(3, city);
            statement.setInt(4, id);

            int rows =
                    statement.executeUpdate();

            if (rows > 0) {
                System.out.println(
                        "Student updated successfully!"
                );
            } else {
                System.out.println(
                        "Student not found!"
                );
            }

            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteStudent {

    public static void deleteStudent(int id) {

        String query =
                "DELETE FROM students WHERE id = ?";

        try {
            Connection connection =
                    DatabaseConnection.getConnection();

            PreparedStatement statement =
                    connection.prepareStatement(query);

            statement.setInt(1, id);

            int rows =
                    statement.executeUpdate();

            if (rows > 0) {
                System.out.println(
                        "Student deleted successfully!"
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

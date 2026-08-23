import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteData {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "root";

        String sql =
                "DELETE FROM students WHERE id = ?";

        try (
            Connection connection =
                    DriverManager.getConnection(
                            url, username, password);

            PreparedStatement statement =
                    connection.prepareStatement(sql)
        ) {

            statement.setInt(1, 1);

            int rows = statement.executeUpdate();

            System.out.println(
                    rows + " record deleted successfully."
            );

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}

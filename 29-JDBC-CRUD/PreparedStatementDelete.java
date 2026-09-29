import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementDelete {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "root";

        String query =
                "DELETE FROM students WHERE id = ?";

        try {
            Connection connection =
                    DriverManager.getConnection(url, username, password);

            PreparedStatement statement =
                    connection.prepareStatement(query);

            statement.setInt(1, 2);

            int rows = statement.executeUpdate();

            System.out.println(rows + " student deleted successfully!");

            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
